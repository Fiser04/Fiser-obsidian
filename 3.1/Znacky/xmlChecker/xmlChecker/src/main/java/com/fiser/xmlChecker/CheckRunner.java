package com.fiser.xmlChecker;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "xmlchecker.runner.enabled", havingValue = "true", matchIfMissing = true)
public class CheckRunner implements ApplicationRunner, ExitCodeGenerator {

	private final ValidationService validationService;
	private final ReportPrinter reportPrinter;
	private int exitCode;

	public CheckRunner(ValidationService validationService, ReportPrinter reportPrinter) {
		this.validationService = validationService;
		this.reportPrinter = reportPrinter;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Map<String, String> options = parseOptions(args);
		if (options.containsKey("xml") || options.containsKey("xsd")) {
			runOnce(options);
		} else {
			runInteractive();
		}
	}

	private Map<String, String> parseOptions(ApplicationArguments args) {
		Map<String, String> options = new LinkedHashMap<>();
		String[] tokens = args.getSourceArgs();
		for (int i = 0; i < tokens.length; i++) {
			String token = tokens[i];
			if (!token.startsWith("--")) {
				continue;
			}
			String body = token.substring(2);
			int equals = body.indexOf('=');
			if (equals >= 0) {
				options.put(body.substring(0, equals), body.substring(equals + 1));
			} else if (i + 1 < tokens.length && !tokens[i + 1].startsWith("--")) {
				options.put(body, tokens[++i]);
			} else {
				options.put(body, "");
			}
		}
		return options;
	}

	private void runOnce(Map<String, String> options) throws Exception {
		String xml = options.get("xml");
		String xsd = options.get("xsd");
		ValidationResult result = validateOrReport(xml, xsd);
		if (result == null) {
			this.exitCode = 2;
			return;
		}
		reportPrinter.print(result, System.out);
		this.exitCode = result.isValid() ? 0 : 1;
	}

	private void runInteractive() throws Exception {
		System.out.println("XML checker. Enter 'q' at any prompt to quit.");
		try (Scanner scanner = new Scanner(System.in)) {
			while (true) {
				String xml = prompt(scanner, "XML file");
				if (xml == null) {
					return;
				}
				String xsd = prompt(scanner, "XSD file");
				if (xsd == null) {
					return;
				}
				ValidationResult result = validateOrReport(xml, xsd);
				if (result != null) {
					reportPrinter.print(result, System.out);
				}
			}
		}
	}

	private String prompt(Scanner scanner, String label) {
		System.out.print(label + " > ");
		if (!scanner.hasNextLine()) {
			System.out.println();
			return null;
		}
		String line = scanner.nextLine().trim();
		return line.isEmpty() || line.equalsIgnoreCase("q") ? null : line;
	}

	private ValidationResult validateOrReport(String xml, String xsd) throws Exception {
		if (xml == null || xsd == null) {
			System.err.println("Both --xml and --xsd are required.");
			return null;
		}
		Path xmlPath = Path.of(xml);
		Path xsdPath = Path.of(xsd);
		if (!Files.isRegularFile(xmlPath)) {
			System.err.println("XML file not found: " + xmlPath.toAbsolutePath());
			return null;
		}
		if (!Files.isRegularFile(xsdPath)) {
			System.err.println("XSD file not found: " + xsdPath.toAbsolutePath());
			return null;
		}
		return validationService.validate(xmlPath, xsdPath);
	}

	@Override
	public int getExitCode() {
		return exitCode;
	}
}

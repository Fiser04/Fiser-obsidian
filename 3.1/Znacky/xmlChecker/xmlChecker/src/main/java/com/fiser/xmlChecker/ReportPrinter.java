package com.fiser.xmlChecker;

import java.io.PrintStream;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ReportPrinter {

	public void print(ValidationResult result, PrintStream out) {
		if (result.isValid()) {
			out.println(result.xml() + ": VALID");
			return;
		}
		out.println(result.xml() + ": INVALID (" + result.errors().size() + " problem(s))");
		for (ErrorRecord error : result.errors()) {
			out.println("  " + error.severity() + "  " + result.xml() + ":" + error.line() + ":" + error.column()
					+ "  " + error.path());
			for (String line : error.message().split("\\R")) {
				out.println("          " + line);
			}
		}
	}

	public void printAll(List<ValidationResult> results, PrintStream out) {
		results.forEach(result -> print(result, out));
	}
}

package com.fiser.xmlChecker;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ValidationServiceTests {

	@Autowired
	private ValidationService validationService;

	private final Path xsd = Path.of("src/test/resources/catalog.xsd");

	@Test
	void validDocumentPasses() throws Exception {
		ValidationResult result = validationService.validate(Path.of("src/test/resources/good.xml"), xsd);
		assertThat(result.isValid()).isTrue();
		assertThat(result.errors()).isEmpty();
	}

	@Test
	void invalidDocumentReportsErrorsWithLocationAndPath() throws Exception {
		ValidationResult result = validationService.validate(Path.of("src/test/resources/bad.xml"), xsd);
		assertThat(result.isValid()).isFalse();
		assertThat(result.errors()).isNotEmpty();

		for (ErrorRecord error : result.errors()) {
			assertThat(error.line()).isPositive();
			assertThat(error.column()).isPositive();
			assertThat(error.path()).startsWith("/catalog");
			assertThat(error.message()).isNotBlank();
		}
	}

	@Test
	void missingAttributePointsAtSecondBook() throws Exception {
		ValidationResult result = validationService.validate(Path.of("src/test/resources/bad.xml"), xsd);
		assertThat(result.errors()).anySatisfy(error -> {
			assertThat(error.message()).contains("id");
			assertThat(error.path()).isEqualTo("/catalog/book[2]");
		});
	}

	@Test
	void malformedDocumentReportsFatalErrorWithLine() throws Exception {
		ValidationResult result = validationService.validate(Path.of("src/test/resources/broken.xml"), xsd);
		assertThat(result.isValid()).isFalse();
		assertThat(result.errors()).anySatisfy(error -> {
			assertThat(error.severity()).isEqualTo("FATAL");
			assertThat(error.line()).isPositive();
		});
	}
}

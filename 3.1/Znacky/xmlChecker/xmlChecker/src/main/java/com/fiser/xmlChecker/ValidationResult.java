package com.fiser.xmlChecker;

import java.nio.file.Path;
import java.util.List;

public record ValidationResult(Path xml, List<ErrorRecord> errors) {

	public boolean isValid() {
		return errors.isEmpty();
	}
}

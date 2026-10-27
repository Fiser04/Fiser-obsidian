package com.fiser.xmlChecker;

public record ErrorRecord(String severity, String message, int line, int column, String path) {
}

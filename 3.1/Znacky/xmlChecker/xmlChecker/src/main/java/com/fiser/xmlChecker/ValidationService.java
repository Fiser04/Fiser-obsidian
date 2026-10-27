package com.fiser.xmlChecker;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.xml.sax.ErrorHandler;
import org.springframework.stereotype.Service;

@Service
public class ValidationService {

	private final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

	public ValidationResult validate(Path xml, Path xsd) throws IOException, SAXException {
		Schema schema = schemaFactory.newSchema(xsd.toFile());
		Validator validator = schema.newValidator();

		XMLReader reader = createXmlReader();
		XPathTracker tracker = new XPathTracker(reader);

		List<ErrorRecord> errors = new ArrayList<>();
		validator.setErrorHandler(new CollectingErrorHandler(tracker, errors));

		SAXSource source = new SAXSource(tracker, new InputSource(xml.toFile().toURI().toString()));
		try {
			validator.validate(source);
		} catch (SAXParseException e) {
			// fatal errors are recorded by the error handler before being rethrown
		}
		return new ValidationResult(xml, List.copyOf(errors));
	}

	private XMLReader createXmlReader() throws SAXException {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setNamespaceAware(true);
			factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
			return factory.newSAXParser().getXMLReader();
		} catch (Exception e) {
			throw new SAXException("Could not create XML reader", e);
		}
	}

	private static final class CollectingErrorHandler implements ErrorHandler {

		private final XPathTracker tracker;
		private final List<ErrorRecord> errors;

		private CollectingErrorHandler(XPathTracker tracker, List<ErrorRecord> errors) {
			this.tracker = tracker;
			this.errors = errors;
		}

		@Override
		public void warning(SAXParseException e) {
			errors.add(record("WARNING", e));
		}

		@Override
		public void error(SAXParseException e) {
			errors.add(record("ERROR", e));
		}

		@Override
		public void fatalError(SAXParseException e) throws SAXException {
			errors.add(record("FATAL", e));
			throw e;
		}

		private ErrorRecord record(String severity, SAXParseException e) {
			return new ErrorRecord(severity, e.getMessage(), e.getLineNumber(), e.getColumnNumber(),
					tracker.currentPath());
		}
	}
}

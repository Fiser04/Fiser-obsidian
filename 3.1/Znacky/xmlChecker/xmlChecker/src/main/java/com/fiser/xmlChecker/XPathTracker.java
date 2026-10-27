package com.fiser.xmlChecker;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;

public class XPathTracker extends XMLFilterImpl {

	private final Deque<String> path = new ArrayDeque<>();
	private final Deque<Map<String, Integer>> siblingCounts = new ArrayDeque<>();
	private String lastEndedPath;
	private boolean lastEventWasEnd;

	public XPathTracker(XMLReader parent) {
		super(parent);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		Map<String, Integer> counts = siblingCounts.peek();
		if (counts == null) {
			counts = new HashMap<>();
			siblingCounts.push(counts);
		}
		String name = localName.isEmpty() ? qName : localName;
		int occurrence = counts.merge(name, 1, Integer::sum);
		path.push(occurrence > 1 ? name + "[" + occurrence + "]" : name);
		siblingCounts.push(new HashMap<>());
		lastEventWasEnd = false;
		super.startElement(uri, localName, qName, atts);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
		this.lastEndedPath = joinPath();
		path.pop();
		siblingCounts.pop();
		lastEventWasEnd = true;
	}

	public String currentPath() {
		if (lastEventWasEnd && lastEndedPath != null) {
			return lastEndedPath;
		}
		return joinPath();
	}

	private String joinPath() {
		StringBuilder result = new StringBuilder();
		for (String segment : path) {
			result.insert(0, "/" + segment);
		}
		return result.toString();
	}
}

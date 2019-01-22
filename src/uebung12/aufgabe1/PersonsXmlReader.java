package uebung12.aufgabe1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

public class PersonsXmlReader {

	public List<Person> readFile(String filename) {
		List<Person> personList = new ArrayList<Person>();

		try {
			File file = new File(filename);
			FileInputStream stream = new FileInputStream(file);
			XMLInputFactory factory = XMLInputFactory.newInstance();
			// factory.setXY(...) ;
			XMLStreamReader in = factory.createXMLStreamReader(stream);

			Person p = null;
			while (in.hasNext()) {
				int eventTypeAsInt = in.next(); // in.next() : move on to next element
				System.out.println(" eventType: " + getEventTypeString(eventTypeAsInt));
				if (in.isStartElement()) {
					if ("person".equals(in.getLocalName())) {
						String id = in.getAttributeValue("", "id");
						p = new Person(id);
						personList.add(p);
					}
					if ("name".equals(in.getLocalName())) {
						p.setName(in.getElementText());
					}
					if ("vorname".equals(in.getLocalName())) {
						p.addVorname(in.getElementText());
					}
					if ("alter".equals(in.getLocalName())) {
						p.setAlter(Integer.parseInt(in.getElementText()));
					}
				}
			}
			in.close();

		} catch (FileNotFoundException e) {
			// handle exception ...
			new RuntimeException("File could not be found!");
		} catch (XMLStreamException e) {
			// handle exception ...
			e.printStackTrace();
		}
		return personList;
	}

	// The following method is not necessary to read an XML file
	// It is only used here to help explaining how the XMLReader works

	/**
	 * Returns the String representation of the given integer constant.
	 * 
	 * @param eventType
	 *            Type of event.
	 * @return String representation of the event
	 */
	private final static String getEventTypeString(int eventType) {
		switch (eventType) {
		case XMLEvent.START_ELEMENT:
			return "START_ELEMENT";
		case XMLEvent.END_ELEMENT:
			return "END_ELEMENT";
		case XMLEvent.PROCESSING_INSTRUCTION:
			return "PROCESSING_INSTRUCTION";
		case XMLEvent.CHARACTERS:
			return "CHARACTERS";
		case XMLEvent.COMMENT:
			return "COMMENT";
		case XMLEvent.START_DOCUMENT:
			return "START_DOCUMENT";
		case XMLEvent.END_DOCUMENT:
			return "END_DOCUMENT";
		case XMLEvent.ENTITY_REFERENCE:
			return "ENTITY_REFERENCE";
		case XMLEvent.ATTRIBUTE:
			return "ATTRIBUTE";
		case XMLEvent.DTD:
			return "DTD";
		case XMLEvent.CDATA:
			return "CDATA";
		case XMLEvent.SPACE:
			return "SPACE";
		}
		return "UNKNOWN_EVENT_TYPE , " + eventType;
	}

}

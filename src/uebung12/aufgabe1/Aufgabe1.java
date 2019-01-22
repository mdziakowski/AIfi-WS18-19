package uebung12.aufgabe1;

import java.util.List;

/**
 * @author dgrether
 *
 */
public class Aufgabe1 {

	private static void printPersonsList(List<Person> persons){
		for (Person p : persons){
			System.out.println("Person Id: " + p.getId());
			System.out.println("  Name: " + p.getName());
			System.out.println("  Vornamen: ");
			for (String s : p.getVornamen()){
				System.out.println("    " + s);
			}
			System.out.println("  Alter " + p.getAlter());
		}
	}
	
	public static void main(String[] args) throws Exception {
		String personsXmlFile = "data/uebung12/2014-01-21_persons.xml";
		PersonsXmlReader xmlParser = new PersonsXmlReader();
		List<Person> personsXml = xmlParser.readFile(personsXmlFile);
//		System.out.println();
//		System.out.println("xml persons reader: ");
//		printPersonsList(personsXml);
//		
//		System.out.println();
//		System.out.println("csv persons reader: ");
//		String personsCsvFile = "data/uebung12/2014-01-21_persons.csv";
//		PersonsCSVReader csvParser = new PersonsCSVReader();
//		List<Person> personsCsv = csvParser.readFile(personsCsvFile);
//		printPersonsList(personsCsv);
	}

}

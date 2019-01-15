package uebung12.aufgabe1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author gleich
 *
 */
public class PersonsCSVReader {

	public List<Person> readFile(String csvFilename) {
		File inputFile = new File(csvFilename);
		List<Person> personList = new ArrayList<Person>();

		try (
				// note resources in round brackets, not curly!
				BufferedReader in = new BufferedReader(new FileReader(inputFile));) {

			String line = in.readLine(); // skip header
			while ((line = in.readLine()) != null) {
				String[] entries = line.split(";");
				String id = entries[0];
				String name = entries[1];
				String vorname = entries[2];
				int alter = Integer.parseInt(entries[3]);
				Person p = new Person(id);
				p.setName(name);
				p.addVorname(vorname);
				p.setAlter(alter);
				personList.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return personList;
	}

}

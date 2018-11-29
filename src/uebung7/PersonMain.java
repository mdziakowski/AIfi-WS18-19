package uebung7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PersonMain {

	public static void main(String[] args) {
		
		Person person = new Person("Carmo", 28);
		
		person.bDay();
		System.out.println(person.toString());
		
		Person franko = new Person("Franko",47);
		Person lorenz = new Person("Lorenz",30);
		Person roman = new Person("Roman",17);
		List<Person> personList = new ArrayList<>();
		personList.add(franko);
		personList.add(lorenz);
		personList.add(roman);
		
		for (Person x : personList) {
			x.bDay();
			System.out.println(x.toString());
		}
		
		personList.remove(1);
		for (Person x : personList) {
			System.out.println(x.toString());
		}
		
		personList.add(2, person);
		for (Person x : personList) {
			System.out.println(x.toString());
		}
		System.out.println(personList.size());
		System.out.println(personList.isEmpty());
		
		if (personList.contains(person)) {
			personList.remove(personList.indexOf(person));
		}
		for (Person x : personList) {
			System.out.println(x.toString());
		}
		
		
		
		
		Map<String, Person> personMap = new HashMap<>();
		personMap.put("Franko", franko);
		personMap.put("Lorenz", lorenz);
		personMap.put("Roman", roman);
		
		System.out.println(personMap.size());	
		
		System.out.println(personMap.get("Lorenz").hungry);
		personMap.get("Lorenz").setHungry(false);
		System.out.println(personMap.get("Lorenz").hungry);
		
		
		for (String x : personMap.keySet()) {
			System.out.println(personMap.get(x).toString());
		}
		
		personMap.remove("Lorenz");
		System.out.println(personMap.get("Lorenz"));
		System.out.println(personMap.get("Forenz"));
		
	}

}

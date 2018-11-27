package uebung7;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
	private String name;
	private int alter;
	private boolean hungry = true;
	
	Person(String name, int alter){
		this.name=name;
		this.alter=alter;
	}
	
	
	public static void main (String args []){
		
		Person pers1 = new Person("Theodor", 20);
		Person pers2 = new Person("Paul", 21);
		Person pers3 = new Person("Todor",50);
		
//		System.out.println(pers2.toString());
//		pers2.oneYear();
//		System.out.println(pers2.toString());
		
		ArrayList<Person> personenliste = new ArrayList<>();
		personenliste.add(pers1);
		personenliste.add(pers2);
		personenliste.add(pers3);
		
//		for (Person personInSchleife : personenliste ){
//			System.out.println(personInSchleife.toString());
//			personInSchleife.oneYear();
//			System.out.println(personInSchleife.toString());
//		}
		
		listeAusgeben(personenliste);
		personenliste.remove(pers2);
		listeAusgeben(personenliste);
		
		Person pers4 = new Person ("Tim", 30);
		personenliste.add(0,pers4);
		listeAusgeben(personenliste);
		
		Person pers5 = new Person ("Annika", 22);
//		personenliste.add(4,pers5); // nicht möglich, da out of bounds
		
		System.out.println(personenliste.size());
//		personenliste.clear();
//		System.out.println(personenliste.size());
		System.out.println(personenliste.isEmpty());
		
//		if (personenliste.contains(pers2)){
//			personenliste.remove(pers2);
//			System.out.println(pers2.toString() + " REMOVED!");
//		}
		
		int indexPers1 = personenliste.indexOf(pers1);
		personenliste.remove(indexPers1);
		System.out.println(indexPers1);
		listeAusgeben(personenliste);
		personenliste.remove(indexPers1);
		listeAusgeben(personenliste);
		
		
		HashMap<String, Person> personenHashMap = new HashMap<>();
		personenHashMap.put(pers1.name, pers1);
		personenHashMap.put(pers2.name, pers2);
		personenHashMap.put(pers3.name, pers3);
		personenHashMap.put(pers4.name, pers4);
		personenHashMap.put(pers5.name, pers5);
		System.out.println(personenHashMap.size());
		
		(personenHashMap.get("Theodor")).toggleHungry();
		System.out.println((personenHashMap.get("Theodor").hungry));
		
		
		for (Person persInSchl : personenHashMap.values()){
			System.out.println(persInSchl.toString() + " hungrig? " + persInSchl.hungry);			
		}
		
		personenHashMap.remove("Tim");
		System.out.println(personenHashMap.containsKey("Tim"));
		System.out.println(personenHashMap.get("Grantelbart"));
		System.out.println(personenHashMap.get("Annika"));
		
		
	}


	private static void listeAusgeben(ArrayList<Person> personenliste) {
		for (Person personInSchleife : personenliste ){
			System.out.println(personInSchleife.toString());
		}
		System.out.println(" ");
	}
	
	
	public String toString() {
		return("Name: " + name + ", Alter: " + alter + ".");
	}
	
	public void oneYear() {
		alter++;
	}
	
	public void toggleHungry(){
		hungry = !hungry;
	}
}

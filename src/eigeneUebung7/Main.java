package eigeneUebung7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {

	public static void main(String[] args) {
//		Person ernie = new Person("ernie", 14);
//		ernie.birthday();
//		System.out.println(ernie );
//		
//		Person bert = new Person("bert", 65);
//		Person hanna = new Person("hanna", 34);
//		
//		List<Person> list = new ArrayList<>();
//		
//		list.add(bert);
//		list.add(ernie);
//		list.add(hanna);
//		
//		for (Person ii : list) {
//			ii.birthday();
//			System.out.println(ii);
//		}
//		System.out.println("");
//		
//		list.remove(bert);
//		
//		for (Person ii : list) {
//			ii.birthday();
//			System.out.println(ii);
//		}
//		System.out.println("");
//
//		
//		Person flora = new Person("flora", 22);
//		list.add(0, flora);
//		
//		for (Person ii : list) {
//			ii.birthday();
//			System.out.println(ii);
//		}
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
//
//		System.out.println(list.isEmpty());
//		
//		if (list.contains(flora)) {
//			list.remove(flora);
//		}
//		
//		for (Person ii : list) {
//			ii.birthday();
//			System.out.println(ii);
//		}
//		System.out.println(list.size());
//		
//		int index = list.indexOf(hanna);
//		list.remove(index);
//		list.remove(index);
		 
		
		Person ben = new Person("ben", 45);
		Person stevie = new Person("Stevie", 54);
		Person laura = new Person("laura", 76);
		
		Map<String, Person> map = new HashMap<>();
		map.put("ben", ben);
		map.put("stevie", stevie);
		map.put("laura", laura);
		
		System.out.println(map.size());
		
		for (Person p : map.values()) {
			p.setHungry(true);
			System.out.println(p);
		}
		
		((Person)map.get("stevie")).setHungry(false);
		
		for (Person p : map.values()) {
			System.out.println(p);
		}
		
		map.remove("ben");
		System.out.println(map.containsKey("ben"));
		map.get("ben");
		
	}

}

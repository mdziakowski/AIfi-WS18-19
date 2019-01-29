package LinkedList_vs_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lists {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();

		int n = 100000;
		
		System.out.println("ArrayList");
		long lastTimeMillis = System.currentTimeMillis();
		for (int i = 0; i < 10 * n; i++) {
			arrayList.add("Keks");
		}
		System.out.println("10*n Eintraege anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		arrayList.get(5 * n);
		System.out.println("5*n Element ausgeben: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		arrayList.add(0, "Waffel");
		System.out.println("Neues Element am Anfang anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		arrayList.add(n * 5, "Schokowafel");
		System.out.println("Neues Element an Platz n * 5 anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		arrayList.add(10*n, "Kokoswaffel");
		System.out.println("Neues Element am Ende anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		
		System.out.println("linkedList");
		lastTimeMillis = System.currentTimeMillis();
		for (int i = 0; i < 10 * n; i++) {
			linkedList.add("Keks");
		}
		System.out.println("10*n Eintraege anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		linkedList.get(5 * n);
		System.out.println("5*n Element ausgeben: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		linkedList.add(0, "Waffel");
		System.out.println("Neues Element am Anfang anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		ListIterator<String> it = linkedList.listIterator(5*n);
		System.out.println("Bis zum n * 5 Element laufen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		it.add("Kokuswaffel");
		System.out.println("Neues Element an Platz n * 5 anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		linkedList.add(10*n, "Kokoswaffel");
		System.out.println("Neues Element am Ende anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
	}

}

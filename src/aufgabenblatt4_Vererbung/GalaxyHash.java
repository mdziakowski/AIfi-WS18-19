/*
 * Hashmap is unsorted. There is no guarantee that the order will remain constant over time.
 * Treemap is sorted by keys, in lexographic fashion. If there were an compareTo override for the keys, that would be used. 
 * LinkedHashMap preserves order of insertion. 
 * 
 */



package aufgabenblatt4_Vererbung;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class GalaxyHash {

	public static void main(String[] args) {
		// Create Galaxy Elements
		GalaxyElement gal = new GalaxyElement("Beet", 9, 9, 10000.00) ;
		Sun ss = new Sun("Carrot", 10, 5, 100.00) ;
		Planet pl = new Planet("Spinach", ss, 5, 1) ;
		SpaceShip sp = new SpaceShip("Voyager") ;
		Sun ss1 = new Sun("A", 10, 5, 100.00) ;
		Sun ss2 = new Sun("B", 10, 5, 100.00) ;
		Sun ss3 = new Sun("C", 10, 5, 100.00) ;
		
		//Add Elements to Hash
		Map<String, GalaxyElement> map = new HashMap<>() ;
		map.put(gal.getName(), gal) ;
		map.put(ss.getName(), ss) ;
		map.put(pl.getName(), pl) ;
		map.put(sp.getName(), sp) ;
		map.put(ss1.getName(), ss1) ;
		map.put(ss2.getName(), ss2) ;
		map.put(ss3.getName(), ss3) ;
		
		
		map.forEach((key, value) -> System.out.println(key + " : " + value));
		System.out.println("");
		act(map) ;
		System.out.println("");
		map.forEach((key, value) -> System.out.println(key + " : " + value));
		
		
	}
	
	private static void act(Map<String, GalaxyElement> map) {
		for (Iterator<GalaxyElement> it = map.values().iterator() ; it.hasNext() ; ) {
			GalaxyElement element = it.next() ;
			if (element instanceof Movable) 
				((Movable) element).move() ;
			
			if (element instanceof Destroyable) {
				int rnd = new Random().nextInt(26) ;
				((Destroyable) element).hit(rnd) ;
				if (((Destroyable) element).isDestroyed()) {
					System.out.println(element.name + " has been destroyed :( ");
					it.remove();		
				}	
			}
		}
	}


}

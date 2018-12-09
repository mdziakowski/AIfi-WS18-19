package hausaufgaben.aufgabenblatt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class GalaxyElement implements Comparable<GalaxyElement> {
	protected double x = 0;
	protected double y = 0;
	protected double size = 1;
	protected String name;
	
	/////////////////Konstruktoren
	
	GalaxyElement ( String str ){
		name=str;		
	}
	
	GalaxyElement ( String str , double x , double y , double size ) {
		this ( str );
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	
	//////// Main
	public static void main (String args[]) {
		//allesMitList();
		//allesMitMap();
		//aufgabe4SortierenNachGroesse();
		aufgabe4SoriterenNachGUndN();
		
		
	}
	
	
	//// Auslagerung Methoden
	private static void allesMitList() {
		Sun s1 = new Sun ("sonne1");
		Planet p1 = new Planet ("Galxy1", s1, 123);
		SpaceShip sps1 = new SpaceShip ("Spaceship1", 20, 20, 10, 10);
		SpaceShip sps2 = new SpaceShip ("Spaceship2", 30, 30, 10, 10);
		
		ArrayList<GalaxyElement> galaxy = new ArrayList<> ();
		galaxy.add(s1);
		galaxy.add(p1);
		galaxy.add(sps1);
//		galaxy.add(sps2);
		
		
//		for (GalaxyElement element : galaxy) {
//			System.out.println(element.toString());
//		}
		
//		for (GalaxyElement element : galaxy) {
//			if (element instanceof Movable) {
//				for (int i = 1 ; i< 8 ; i++) {
//					((Movable) element).move();
//				}
//			}
//		}
		
		//Lösungsweg ohne Iteratoren
		
//		for (int i = 1 ; i < 10 ; i++) {
//			for (GalaxyElement element : galaxy) {
//				if (element instanceof Destroyable) {
//					((Destroyable) element).hit(Math.random()*25);
//					System.out.println(((SpaceShip) element).getEnergy());
//					if (((Destroyable) element).isDestroyed()) {
//						System.out.println("Lösche aus Liste");
//						break; // Wieso kann ich mit break die Schleife nicht verlassen?
//					}
//				}
//			}
//		}
	
		
		
		// Lösungsweg mit Iteratoren
		for (int i = 1 ; i < 10 ; i++) {
			for (Iterator<GalaxyElement> it = galaxy.iterator() ; it.hasNext() ;) {
				GalaxyElement aktuell = it.next();
				if (aktuell instanceof Destroyable) {
					((SpaceShip) aktuell).hit(Math.random()*25);
					System.out.println("Energy: " + ((SpaceShip) aktuell).getEnergy());
					if (((Destroyable) aktuell).isDestroyed()) {
						System.out.println("Destroyed");
						it.remove();
						break;
					}
				}
			}
		}

		
		
		
		
	}
	
	private static void allesMitMap(){
		Sun s1 = new Sun ("sonne1");
		Planet p1 = new Planet ("Galxy1", s1, 123);
		SpaceShip sps1 = new SpaceShip ("Spaceship1", 20, 20, 10, 10);
		
		HashMap<String,GalaxyElement> galaxy = new HashMap<> ();
		galaxy.put(s1.getName(), s1);
		galaxy.put(p1.getName(), p1);
		galaxy.put(sps1.getName(), sps1);
		
		
//		for (GalaxyElement element : galaxy.values()) {
//			System.out.println(element.toString());
//		}
//		
//		for (GalaxyElement element : galaxy.values()) {
//			if (element instanceof Movable) {
//				for (int i = 1 ; i< 8 ; i++) {
//					((Movable) element).move();
//				}
//			}
//		}
//		
		for (int i = 1 ; i < 10 ; i++) {
			for (GalaxyElement element : galaxy.values()) {
				if (element instanceof Destroyable) {
					((Destroyable) element).hit(Math.random()*25);
					System.out.println(((SpaceShip) element).getEnergy());
					if (((Destroyable) element).isDestroyed()) {
						System.out.println("Lösche aus Liste");
						break; // Wieso kann ich mit break die Schleife nicht verlassen?
					}
				}
			}
		}
	}
		
	private static void aufgabe4SortierenNachGroesse() {
		Sun s1 = new Sun ("sonne1");
		Planet p1 = new Planet ("Galxy1", s1, 123);
		SpaceShip sps1 = new SpaceShip ("Spaceship1", 20, 20, 10, 10);
		SpaceShip sps2 = new SpaceShip ("Spaceship2", 30, 30, 10, 10);
		
		ArrayList<GalaxyElement> galaxy = new ArrayList<> ();
		galaxy.add(s1);
		galaxy.add(p1);
		galaxy.add(sps1);
		galaxy.add(sps2);
		
		Collections.sort(galaxy);
		
		for (GalaxyElement element : galaxy) {
			System.out.println("Name: " + element.getName() + ", Groesse: " + element.getSize());
		}
		
		
		
	}
	
	private static void aufgabe4SoriterenNachGUndN() {
		Sun s1 = new Sun ("sonne1");
		Planet p1 = new Planet ("Galxy1", s1, 123);
		SpaceShip sps1 = new SpaceShip ("Spaceship1", 20, 20, 10, 10);
		SpaceShip sps2 = new SpaceShip ("Spaceship2", 30, 30, 10, 10);
		
		ArrayList<GalaxyElement> galaxy = new ArrayList<> ();
		galaxy.add(s1);
		galaxy.add(p1);
		galaxy.add(sps1);
		galaxy.add(sps2);
		
		for (GalaxyElement element : galaxy) {
			System.out.println(element.getName() + " :" + element.getSize());
		}
		
		Collections.sort(galaxy, new GEComparator());
		System.out.println(" ");
		
		for (GalaxyElement element : galaxy) {
			System.out.println(element.getName() + " :" + element.getSize());
		}
		
	}
	/////////////////Methoden
	
	
	
	public String toString() {
		return ("GalaxyElement, Name: " + name + ", X: " + x + ", Y: " + y + ", Größe: " + size);
	}
	
	/////////////////Getter
	
	public double getX () {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}

	public int compareTo(GalaxyElement element) {
		if(this.size > element.size) {
			return 1;
		} else if (this.size == element.size) {
			return 0;
		} else {
			return -1;
		}
	}

	public int compareToSize(double size) {
		if(this.getSize() > size) {
			return 1;
		} else if (this.getSize() == size) {
			return 0;
		} else {
			return -1;
		}
	}
	
	public int compareToName(String str) {
		if ( (this.getName()).compareTo(str) > 1 ) {
			return 1;
		} else if (this.getName() == name) {
			return 0;
		} else {
			return -1;
		}
	}
}

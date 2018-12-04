package hausaufgaben.aufgabenblatt4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class GalaxyElement {
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
		allesMitList();
		//allesMitMap();
		
		
		
	}
	
	
	//// Auslagerung Methoden
	private static void allesMitList() {
		Sun s1 = new Sun ("sonne1");
		Planet p1 = new Planet ("Galxy1", s1, 123);
		SpaceShip sps1 = new SpaceShip ("Spaceship1", 20, 20, 10, 10);
		
		ArrayList<GalaxyElement> galaxy = new ArrayList<> ();
		galaxy.add(s1);
		galaxy.add(p1);
		galaxy.add(sps1);
		
		
//		for (GalaxyElement element : galaxy) {
//			System.out.println(element.toString());
//		}
		
		for (GalaxyElement element : galaxy) {
			if (element instanceof Movable) {
				for (int i = 1 ; i< 8 ; i++) {
					((Movable) element).move();
				}
			}
		}
		
		//Lösungsweg ohne Iteratoren
		
		for (int i = 1 ; i < 10 ; i++) {
			for (GalaxyElement element : galaxy) {
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
	
		
		// Lösungsweg mit Iteratoren --> kann Element löschen, funktioniert hier aber nicht, endet in Endlosschleife, wieso?
		
//		for (int i = 1 ; i < 10 ; i++) {
//			for (Iterator<GalaxyElement> it = galaxy.iterator() ; it.hasNext() ; ) {
//				System.out.println(it.toString());
//				if (it instanceof Destroyable) {
//					((Destroyable) it).hit(Math.random()*25);
////					System.out.println(((SpaceShip) it).getEnergy()); // wieso kann er nicht in Spaceship casten?
//					if (((Destroyable) it).isDestroyed()) {
//						it.remove();
//						break; // Wieso kann ich mit break die Schleife nicht verlassen?
//					}
//				}
//			}
//		}
//		
//		
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
}

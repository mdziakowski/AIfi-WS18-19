package hausaufgaben.aufgabenblatt4;

import java.util.ArrayList;

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
	
	
	////////
	public static void main (String args[]) {
		Sun s1 = new Sun ("sonne1");
		Planet p1 = new Planet ("Galxy1", s1, 123);
		
		ArrayList<GalaxyElement> galaxy = new ArrayList<> ();
		galaxy.add(s1);
		galaxy.add(p1);
		
		for (GalaxyElement element : galaxy) {
			System.out.println(element.toString());
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

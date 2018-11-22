package ha4;

public class Sun extends GalaxyElement {

	Sun(double x, double y, int size, String name) {
		
		super(x, y, size, name);

	}

	Sun(String name) {
		
		super(name);

	}
	
	@Override
	public String toString() {
		
		return ("Die Sonne " + getName() + " hat die Position x: " + getX() + " y: " + getY() + " und die Größe: " + getSize() + ".");
		
	}

}

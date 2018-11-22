package ha4;

public class GalaxyElement {

	double x;
	double y;
	int size;
	String name;

	GalaxyElement(String name) {

		this.name = name;
		this.x = 0;
		this.y = 0;
		this.size = 1;

	}

	GalaxyElement(double x, double y, int size, String name) {

		this.x = x;
		this.y = y;
		this.size = size;
		this.name = name;

	}

	public double getX() {

		return this.x;

	}

	public double getY() {

		return this.y;

	}

	public int getSize() {

		return this.size;

	}

	public String getName() {

		return this.name;

	}
	
	public String toString() {
		
		return (getName() + " hat die Position x: " + getX() + " y: " + getY() + " und die Größe: " + getSize() + ".");
		
	}

}

package aufgabenblatt4;

public final class Planet extends GalaxyElement implements Movable {

	private Sun sun;
	private int distance;
	private final double pi = Math.PI;
	private double angle = 0;

	Planet(String name, Sun sun) {
		super(name, sun.x, sun.y, 0);
		this.sun = sun;
	}
	
	@Override
	public void move() {
		System.out.println("move planet");
		angle += pi/4;
		x = sun.x + distance * Math.cos(angle);
		y = sun.y + distance * Math.sin(angle);
	}
	
	void setDistance(int distance) {
		this.distance = distance;
		super.x += distance;
	}
	
	void setSize(int size) {
		super.size = size;
	}

	@Override
	public String toString() {
		return "Planet: " + name + " Sonne: " + sun.name + " Abstand: " + distance + " x:" + x + " y: " + y;
	}

}

package ha4;

final class Planet extends GalaxyElement implements Movable {
	
	Sun sun;
	double distance;
	double angleMove = Math.PI/4;
	double angle;
	
	Planet(String name, Sun sun) {
		super(name);
		this.sun = sun;
	}
	
	Planet(String name, Sun sun, double distance, double size) {
		super(name);
		this.sun = sun;
		this.distance = distance;
		this.size = size;
	}
	
	@Override
	public String toString() {
			return super.toString() + "; Sun:" + sun.getName() + "; Distance:" + distance;
	}

	@Override
	public void move() {
		System.out.println("move Planet " + name);
		angle += angleMove;
		x = distance * Math.cos(angle);
		y = distance * Math.sin(angle);
	}
}

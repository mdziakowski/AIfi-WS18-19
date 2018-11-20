package uebung6;

class Helicopter implements CanMoveHorizontally, CanMoveVertically{
	String name;
	double x,y,z;
	double speedV = 0;
	double speedH = 0;
	double direction = 0;
	
	Helicopter(String name, double x, double y, double z) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void increaseVerticalSpeed(double by) {
		speedV += by;
	}

	public void increaseHorizontalSpeed(double by) {
		speedH += by;
	}

	public void turnBy(double radians) {
		direction += radians;
	}
	
	public void move() {
		x += Math.cos(direction) * speedH;
		y += Math.sin(direction) * speedH;
		if (z + speedV >= 0) {
			z += speedV;
		}
		else {
			speedV = 0;
			speedH = 0;
			z = 0;
			System.err.println("Helicopter sind keine Uboote!");
		}
	}
	
	public String toString() {
		String id = "Helicopter; Name: " + name + "; X,Y,Z = " +  x + "," + y + "," + z;
		return id;
	}
	
	public String getName() {
		return name;
	}
}

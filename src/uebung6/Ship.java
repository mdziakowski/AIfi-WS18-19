package uebung6;

class Ship implements CanMoveHorizontally {
	String name;
	double x;
	double y;
	double speed = 0;
	double direction= 0;
	
	Ship(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	public void increaseHorizontalSpeed(double by) {
		speed = speed + by;
	}
	
	public void turnBy(double radians) {
		direction = direction + radians;
	}
	
	public void move() {
		x = x + Math.cos(direction) * speed;
		y = y + Math.sin(direction) * speed;
	}
	
	public String toString() {
		String id = "Ship; Name: " + name + "; X,Y = " +  x + "," + y;
		return id;
	}

	public String getName() {
		return name;
	}
}

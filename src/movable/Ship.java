package movable;

public class Ship implements CanMoveHorizontally {

	private String name;
	private double horizontalSpeed = 0;
	private double dirctionInRadians = 0;
	private double x, y;
	
	public Ship(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void move() {
		x = x + Math.cos(dirctionInRadians) * horizontalSpeed;
		y = y + Math.sin(dirctionInRadians) * horizontalSpeed;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseHorizonalSpeed(double by) {
		horizontalSpeed = horizontalSpeed + by;
	}

	@Override
	public void turnBy(double radians) {
		dirctionInRadians = dirctionInRadians + radians;
	}
	
	@Override
	public String toString() {
		return "Ship " + name + " x=" + Math.round(x) + ", y=" + Math.round(y);
	}
	
}

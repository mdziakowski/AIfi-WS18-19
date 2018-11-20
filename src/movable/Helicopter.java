package movable;

public class Helicopter implements CanMoveHorizontally, CanMoveVertically{

	private String name;
	private double horizontalSpeed = 0;
	private double verticalSpeed = 0;
	private double directionInRadians = 0;
	private double x, y, z;
	
	public Helicopter(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public void move() {
		x = x + Math.cos(directionInRadians) * horizontalSpeed;
		y = y + Math.sin(directionInRadians) * horizontalSpeed;
		if (z + verticalSpeed < 0) {
			z = 0;
			horizontalSpeed = 0;
			verticalSpeed = 0;
			System.err.println("Notlandung");
		} else {
			z = z + verticalSpeed;
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		verticalSpeed = verticalSpeed + by;		
	}

	@Override
	public void increaseHorizonalSpeed(double by) {
		horizontalSpeed = horizontalSpeed + by;
	}

	@Override
	public void turnBy(double radians) {
		directionInRadians = directionInRadians + radians;
	}
	
	@Override
	public String toString() {
		return "Helicopter " + name + " x=" + Math.round(x) + ", y=" + Math.round(y) + ", z=" + Math.round(z);
	}

}

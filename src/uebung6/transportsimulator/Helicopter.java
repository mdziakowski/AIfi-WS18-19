package uebung6.transportsimulator;

public class Helicopter implements CanMoveVertically, CanMoveHorizontally {

	private String name;
	private double x,y,z;
	private double horizontalSpeed = 0;
	private double verticalSpeed = 0;
	private double directionInRadians = 0;
	
	Helicopter (String name, double x, double y, double z){
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;		
	}
	
	@Override
	public void move() {
		x = x + horizontalSpeed * Math.cos(directionInRadians);
		y = y + horizontalSpeed * Math.sin(directionInRadians);
		if (z + verticalSpeed < 0 ) {
			horizontalSpeed = 0;
			verticalSpeed = 0;
			z = 0;
			System.err.println("Emergency landing of helicopter " + name + ".");
		} else {
			z = z + verticalSpeed;
		}
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		horizontalSpeed = horizontalSpeed + by;		
	}

	@Override
	public void turnBy(double radians) {
		directionInRadians = directionInRadians + radians;		
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		verticalSpeed = verticalSpeed + by;
		}
	
	public String toString() {
		return ("Helicopter " + name + "x= " + Math.round(x) + " y= " + Math.round(y) + " z= " + Math.round(z));
	}
	

}

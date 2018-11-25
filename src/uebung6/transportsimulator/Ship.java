package uebung6.transportsimulator;

public class Ship implements CanMoveHorizontally {
	
	private double horizontalSpeed;
	private double directionInRadians;
	private double x,y;
	private String name;
	
	Ship(String name, double x, double y){
		this.name=name;
		this.x=x;
		this.y=y;
	}

	@Override
	public void move() {
		x = x + horizontalSpeed * Math.cos(directionInRadians);
		y = y + horizontalSpeed * Math.sin(directionInRadians);	
	}

	@Override
	public String getName() {
		return (name);
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		horizontalSpeed = horizontalSpeed + by;
	}

	@Override
	public void turnBy(double radians) {
		directionInRadians = directionInRadians + radians;		
	}
	
	public String toString() {
		return ("Name: " + name + "Position: (" + x + "," + y + ").");
	}
	

}

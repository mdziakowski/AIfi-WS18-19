package movable;

public class Elevator implements CanMoveVertically {

	private String name;
	private double verticalSpeed = 0;
	private double z;
	
	public Elevator(String name, double z) {
		this.name = name;
		this.z = z;
	}
	
	@Override
	public void move() {
		z = z + verticalSpeed;
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
	public String toString() {
		return "Elevator " + name + ", z=" + Math.round(z);
	}

}

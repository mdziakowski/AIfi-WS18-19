package uebung6.transportsimulator;

public class Elevator implements CanMoveVertically{

	private double verticalSpeed;
	private double z;
	private String name;
	
	Elevator(String name, double z){
		this.z=z;
		this.name=name;
	}
	
	@Override
	public void move() {
		z=z+verticalSpeed;		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		verticalSpeed=by;		
	}
	
	public String toString() {
		return("Name " + name + ", Position z: " + Math.round(z));
	}
	

}

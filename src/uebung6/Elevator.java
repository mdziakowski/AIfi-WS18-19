package uebung6;

class Elevator implements CanMoveVertically {
	String name;
	double z;
	double speed = 0;
	
	Elevator(String name, double z) {
		this.name = name;
		this.z = z;
	}
	
	public void increaseVerticalSpeed(double by) {
		speed = speed + by;
	}
	
	public void move() {
		z = z + speed;
	}
	
	public String toString() {
		String id = "Elevator; Name: " + name + "; Höhe: " +  z;
		return id;
	}

	public String getName() {
		return name;
	}
}

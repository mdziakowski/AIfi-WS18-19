package eigeneUebung6;

class Elevator implements CanMoveVertically {

	private String name;
	private double height;
	private double speed;
	
	Elevator(String name, double z) {
		this.name = name;
		height = z;
	}
	
	@Override
	public void move() {
		height += speed;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		speed = by;
	}
	
	@Override
	public String toString() {
		return "Elevator, " + name + " " + height;
	}

}

package eigeneUebung6;

class Ship implements CanMoveHorizontally {
	
	private String name;
	private double x;
	private double y;
	private double speed;
	private double rad;
	
	Ship(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	@Override
	public void move() {
		x += speed * Math.cos(rad);
		y += speed * Math.sin(rad);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void incraeseHorizontalSpeed(double by) {
		speed += by;
	}

	@Override
	public void turnBy(double radians) {
		rad = radians;
	}
	
	@Override
	public String toString() {
		return "Ship, " + name + " x: " + x + ", y: " + y;
	}

}

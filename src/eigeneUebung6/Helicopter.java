package eigeneUebung6;

class Helicopter implements CanMoveVertically, CanMoveHorizontally {
	
	private String name;
	private double x;
	private double y;
	private double z;
	private double speedHorizontal;
	private double speedVertical;
	private double rad;
	
	Helicopter(String name, double x, double y, double z){
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		if ((z + speedVertical) < 0.0) {
			z = 0.0;
			speedVertical = 0.0;
			speedHorizontal = 0.0;
			System.err.println("Notlandung");			
			
		} else {		
			x += speedHorizontal * Math.cos(rad);
			y += speedHorizontal * Math.sin(rad);
			z += speedVertical;
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void incraeseHorizontalSpeed(double by) {
		// TODO Auto-generated method stub
		speedHorizontal += by;
	}

	@Override
	public void turnBy(double radians) {
		// TODO Auto-generated method stub
		rad = radians;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		// TODO Auto-generated method stub
		speedVertical += by;
	}
	
	@Override
	public String toString() {
		return "Helicopter, " + name + " x: " + x + ", y: " + y + ", z: " +z;
	}

}

package aufgabenblatt4;

final class SpaceShip extends GalaxyElement implements Movable, Destroyable {

	private double speed = 5.0;
	private double energy;
	
	public SpaceShip(String name) {
		super(name, 0,0,2);
		energy = 30.0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("move SpaceShip");
		x += speed;
		y +=speed;
	}
	
	@Override
	public String toString() {
		return "SpaceShip: " + name + "Speed: " + speed + " x: " + x + "y: " + y;
	}

	@Override
	public void hit(double power) {
		// TODO Auto-generated method stub
		energy -= power;		
		System.out.println("Energy now: " + energy);
		
	}
	
	@Override
	public boolean isDestroyed() {
		// TODO Auto-generated method stub
		if (energy <= 0) {return true;}
		return false;
	}	
}

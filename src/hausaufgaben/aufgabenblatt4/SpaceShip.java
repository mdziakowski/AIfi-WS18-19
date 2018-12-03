package hausaufgaben.aufgabenblatt4;

final public class SpaceShip extends GalaxyElement implements Movable, Destroyable  {
	
	private double speedX = 0;
	private double speedY = 0;
	private double x = 50;
	private double y = 50;
	private double energy = 100;
	
	
	SpaceShip(String str){
		super(str);
	}
	
	SpaceShip(String str, double x, double y, double speedX, double speedY){
		super(str);
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY;
	}

	@Override
	public void move() {
		x = x + speedX;
		y = y + speedY;
		System.out.println("Move SpaceShip: " + this.name + ", new X: " + x + ", new Y: " + y);

	}

	@Override
	public void hit(double power) {
		energy = energy - power;
		
	}

	@Override
	public boolean isDestroyed() {
		if (energy < 0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getEnergy() {
		return energy;
	}
	

}

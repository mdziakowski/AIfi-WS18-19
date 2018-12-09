package ha4;

final class SpaceShip extends GalaxyElement implements Movable, Destroyable {

	double xSpeed = 10;
	double ySpeed = 5;
	double energy = 100;
	
	SpaceShip(String name) {
		super(name);
		this.size = 1;
	}
	
	SpaceShip(String name, double xSpeed, double ySpeed, double size) {
		super(name);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.size = size;
	}
	
	@Override
	public String toString() {
		return super.toString() + "; Energy:" + energy;
	}
	
	@Override
	public void move() {
		System.out.println("move Spaceship " + name);
		x += xSpeed;
		y += ySpeed;
	}

	@Override
	public void hit(double power) {
		energy -= power;
		System.out.println(name + " was hit for " + power + " damage!");
	}
	
	@Override
	public boolean isDestroyed() {
		if (energy <= 0) {
			return true;
		}
		else {
			return false;
		}
	}

}

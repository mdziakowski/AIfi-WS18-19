package ha4;

public class SpaceShip extends GalaxyElement implements Movable {

	double speedX;
	double speedY;

	SpaceShip(double x, double y, double speedX, double speedY, int size, String name) {

		super(x, y, size, name);
		this.speedX = speedX;
		this.speedY = speedY;

	}
	
	SpaceShip(String name) {
		
		super(name);
		this.x = 0;
		this.y = 0;
		this.speedX = 1;
		this.speedY = 1;
		this.size = 1;
		
	}

	public void move() {
		
		this.x = this.x + speedX;
		this.y = this.y + speedY;
		
		System.out.println("Moved SpaceShip " + this.name);

	}

}

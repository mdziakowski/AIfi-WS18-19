package aufgabenblatt4_Vererbung;

final class SpaceShip
extends GalaxyElement 
implements Movable, Destroyable 
{
	
	private double vel_x ;
	private double vel_y ;
	double energy ;
	
	public SpaceShip(String tmp, double vel_x , double vel_y) {
		super(tmp, 0.0, 0.0, 1.0);
		this.vel_x = vel_x ;
		this.vel_y = vel_y ;
		this.energy = 10.00 ;
	}
	
	public SpaceShip(String tmp) {
		this(tmp, 10.0, 10.0) ;
	}

	@Override
	public void move() {
		x += vel_x ;
		y += vel_y ;
	}
	
	@Override
	public String toString() {
		return  name + " (Spaceship), size = " + size + " at pos ("+ x + " , " + y + ")" ;
	}

	@Override
	public void hit(double power) {
		this.energy -= power ;
		System.out.println(name + ", Current Energy Level: " + energy);
		
		
	}

	@Override
	public boolean isDestroyed() {
		if (energy <= 0)
			return true ;
		return false;
	}

}

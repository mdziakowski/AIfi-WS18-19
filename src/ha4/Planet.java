package ha4;

public class Planet extends GalaxyElement implements Movable {

	String sun;
	double distanz;
	final double piAngel = (Math.PI) / 4;
	double movedAngel;
	Sun sonne;

	Planet(double distanz, int size, String name, Sun sonne) {

		super(name);
		this.sun = sonne.getName();
		this.distanz = distanz;
		this.size = size;
		this.x = sonne.getX() + this.distanz;
		this.y = sonne.getY();
		this.movedAngel = 0;
		this.sonne = sonne;

	}

	Planet(String name, Sun sonne) {

		super(name);
		this.sun = sonne.getName();
		this.movedAngel = 0;
		this.sonne = sonne;

	}

	@Override
	public String toString() {

		return ("Der Planet " + getName() + " hat den Abstand: " + this.distanz + " zu der Sonne " + this.sun
				+ " und die Position x: " + getX() + " y: " + getY() + " und die Größe: " + getSize() + ".");

	}

	public void move() {

		this.x = sonne.getX() + (this.distanz * Math.cos(this.movedAngel + piAngel));
		this.y = sonne.getY() + (this.distanz * Math.sin(this.movedAngel + piAngel));
		this.movedAngel = this.movedAngel + piAngel;

		System.out.println("Moved Planet " + this.name);

	}

}

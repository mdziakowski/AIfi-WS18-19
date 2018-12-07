package aufgabenblatt4_Vererbung;

final class Planet extends GalaxyElement implements Movable {
	String parent ;
	double radius ;
	Sun sun ;
	double piq = Math.PI / 4 ;
	int move_count = 0 ;
	
	public Planet(String tmp, Sun sun, double radius, double size) { 
		super(tmp, 0.0, 0.0, size) ; // Here, we are using some of the same inputs, but others we set to 0.0. Then we also include additional variables not found in GalaxyElement's Constructor
		this.sun = sun ;
		this.size = size ;
		this.radius = radius ;
		this.parent = sun.name ;
		x = sun.x + radius ;
		y = sun.y ;
		
	}
	
	public Planet(String tmp, Sun sun) {
		this(tmp, sun, 1.0, 1000.0) ; // We build of the the constructor found in this class Planet. We have less inputs so we set defaults for the unused variables
	}
	
	@Override
	public String toString() {
			return  name + " (Planet), child of " + parent +", size = " + size + " at pos ("+ x + " , " + y + ")" ;
	}

	@Override
	public void move() {
		move_count++ ;
		x = sun.x + radius * Math.cos(move_count * piq) ;
		y = sun.y + radius * Math.sin(move_count * piq) ;
	}
		
		

}

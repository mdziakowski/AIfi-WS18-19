package aufgabenblatt4_Vererbung;

class GalaxyElement
implements Comparable<GalaxyElement> {
	double x  ;
	double y ;
	double size ; 
	String name ;
	
	
	// CONSTRUCTORS
	public GalaxyElement(String tmp, double x, double y, double size) {
		name = tmp ;
		this.x = x ;
		this.y = y ;
		this.size = size ;
	}
	
	public GalaxyElement(String tmp) {
		this(tmp, 0.0 , 0.0 , 1000.0 ) ;
	}
	
	// Getters
	public double getX() {
		return x ;
	}
	
	public double getY() {
		return y ;
	}
	
	public double getSize() {
		return size ;
	}
	
	public String getName() {
		return name ;
	}
	
	// toString
	@Override
	public String toString() {
		return "Galaxy: " + name + ", X-Coord: " + x + ", Y-Coord: " + y + ", Size: " + size ; 
	}

	@Override
	public int compareTo(GalaxyElement other) {
		if (this.getSize() > other.getSize())
			return 1 ;
		else if (this.getSize() == other.getSize())
			return 0 ;
		else
			return -1 ;
	}
	
	
}

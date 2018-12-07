package aufgabenblatt4_Vererbung;

final class Sun extends GalaxyElement{

	public Sun(String tmp, int x, int y, double size) {
		super(tmp, x, y, size); // here we are using all inputs from the one constructor of GalaxyELement
	}

	public Sun(String tmp) {
		super(tmp) ;
	}
	
	// toString
	@Override
	public String toString() {
		return  name + " (Sun), size = " + size + " at pos ("+ x + " , " + y + ")" ;
	}
}

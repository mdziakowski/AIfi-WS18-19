package hausaufgaben.aufgabenblatt4;

public final class Planet extends GalaxyElement {
	
	private Sun parentSun;
	private double distanceToSun;
	
	
	//////////////////Konstruktoren
	
	Planet (String str, Sun parentSun){
		super(str);
		this.parentSun = parentSun;
	}
	
	Planet ( String str , double size, Sun parentSun ) {
		super(str);
		this.parentSun = parentSun;
		this.size=size;
	}
	
	Planet (String str, Sun parentSun, double distanceToSun){
		this(str, parentSun);
		this.distanceToSun = distanceToSun;
		x = parentSun.getX() + distanceToSun;
		y = parentSun.getY();
		
	}
	
	
	
	//////////////////Methoden
	@Override
	public String toString() {
		String str = super.toString().substring(13);		
		return ("Planet" + str + ", zugehörige Sonne: " + parentSun.getName() + ", Entfernung: "+ distanceToSun);
	}

}

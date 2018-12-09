package hausaufgaben.aufgabenblatt4;

public final class Planet extends GalaxyElement implements Movable {
	
	private Sun parentSun;
	private double distanceToSun;
	final double ROTATION = Math.PI / 4;
	private double anomalie = 0;
	
	//////////////////Konstruktoren
	
	Planet (String str, Sun parentSun){
		super(str);
		this.parentSun = parentSun;
		this.size = 10;
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
		this.size = 10;
		
	}
	
	
	
	//////////////////Methoden
	@Override
	public String toString() {
		String str = super.toString().substring(13);		
		return ("Planet" + str + ", zugehörige Sonne: " + parentSun.getName() + ", Entfernung: "+ distanceToSun);
	}
	
	public void move() {
		this.anomalie = anomalie + ROTATION;
		this.x = distanceToSun * Math.cos(anomalie);
		this.y = distanceToSun * Math.sin(anomalie);
		System.out.println("Move Planet: " + this.name + ", new X: " + x + ", new Y: " + y + ", Anomalie: " + anomalie);
		
		
	}

}

package hausaufgaben.aufgabenblatt4;

final class Sun extends GalaxyElement {
	
	
	/////////////Konstruktoren
	Sun (String str){
		super(str);
	}
	
	Sun ( String str , double x , double y , double size ) {
		super(str, x, y, size);
	}
	
	
	
	
	
	
	/////////////Methoden
	
	@Override
	public String toString() {
		String str = super.toString().substring(13);		
		return ("Sun" + str);
	}

}

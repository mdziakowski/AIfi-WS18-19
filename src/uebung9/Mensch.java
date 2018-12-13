package uebung9;

class Mensch implements Comparable<Mensch> {
	
	private String name;
	private int geburtsdatum;
	
	Mensch (String name, int geburtsdatum){
		this.name = name;
		this.geburtsdatum = geburtsdatum;
	}
	
	
	@Override
	public int compareTo(Mensch ob) {
		if (this.getName().compareTo(ob.getName()) > 1){
			return 1;
		} else if (this.getName().compareTo(ob.getName()) == 0){
			return 0;
		} else {
			return -1;
		}
	}
	
	String getName(){
		return (this.name);
	}
	
	int getGeburtsdatum(){
		return (this.geburtsdatum);
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void setGeburtsdatum(int geb){
		this.geburtsdatum = geb;
		
	}
	
	boolean equals(Mensch mensch) {
		if ( (this.getName() == mensch.getName()) && ( this.getGeburtsdatum() == mensch.getGeburtsdatum()) ){
			return true;
		} else {
			return (false);
		}
		
	}

}

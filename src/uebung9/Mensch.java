package uebung9;

class Mensch implements Comparable<Mensch> {
	
	private String name;
	private Geburtsdatum geburtsdatum;
	
	Mensch (String name, int T, int M, int Y){
		name = this.name;
		geburtsdatum.setTag(T);
		geburtsdatum.setMonat(M);
		geburtsdatum.setJahr(Y);
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
	
	String getGeburtsdatum(){
		return (this.geburtsdatum.Tag + "." + this.geburtsdatum.Monat + "." + this.geburtsdatum.Jahr);
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void setGeburtsdatum(int Tag, int Monat, int Jahr){
		this.geburtsdatum.Tag = Tag;
		this.geburtsdatum.Monat = Monat;
		this.geburtsdatum.Jahr = Jahr;
	}
	
	boolean equals(Mensch mensch) {
		if ( (this.getName() == mensch.getName()) && ( this.getGeburtsdatum() == mensch.getGeburtsdatum()) ){
			return true;
		} else {
			return (false);
		}
		
	}

}

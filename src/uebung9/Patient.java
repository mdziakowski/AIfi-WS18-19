package uebung9;

class Patient extends Mensch {
	private int versicherungsnummer;
	
	Patient (String name, int geb, int versicherungsnummer){
		super(name, geb);
		this.versicherungsnummer = versicherungsnummer;
	}
	
	int getVersicherungsnummer(){
		return (this.versicherungsnummer);
	}

}

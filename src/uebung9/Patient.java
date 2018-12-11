package uebung9;

class Patient extends Mensch {
	private int versicherungsnummer;
	
	Patient (String name, int T, int M, int Y, int versicherungsnummer){
		super(name, T, M, Y);
		this.versicherungsnummer = versicherungsnummer;
	}
	
	double getVersicherungsnummer(){
		return (this.versicherungsnummer);
	}

}

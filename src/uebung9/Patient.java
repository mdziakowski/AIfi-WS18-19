package uebung9;

class Patient extends Mensch {

	int verNummer;
	
	Patient(String name, String bDay, int verNummer) {
		super(name, bDay);
		this.verNummer = verNummer;
	}
}

package uebung9;

public class Patient extends Mensch {	
	
	private int versicherngsNummer;
	
	public Patient(String name, int geburtsdatum, int versicherngsNummer) {
		super(name, geburtsdatum);
		this.versicherngsNummer = versicherngsNummer;
	}
	
	public int getVersicherungsNummer() {
		return versicherngsNummer;
	}
	
}

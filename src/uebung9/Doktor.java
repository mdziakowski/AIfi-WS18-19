package uebung9;

public class Doktor extends Mensch implements Mitarbeiter {

	int behandeltePatienten = 0;
	int erhaltensGehalt = 0;
	
	public Doktor(String name, int geburtsdatum) {
		super(name, geburtsdatum);
	}

	public void patientBehandelt() {
		behandeltePatienten++;
	}
	
	@Override
	public void gehaltZahlen() {
		erhaltensGehalt = behandeltePatienten * gehalt;	
	}

	@Override
	public int gezahltesGehalt() {
		return erhaltensGehalt;
	}

	
	
}

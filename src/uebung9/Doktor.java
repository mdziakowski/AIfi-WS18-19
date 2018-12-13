package uebung9;

class Doktor extends Mensch implements Mitarbeiter{
	private int kontostand;
	
	Doktor (String name, int geb){
		super(name, geb);
	}

	@Override
	public void zahleGehalt() {
		kontostand += gehalt;
	}

}

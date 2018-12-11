package uebung9;

class Doktor extends Mensch implements Mitarbeiter {

	double geld = 0;
	
	Doktor(String name, String bDay) {
		super(name, bDay);
	}

	@Override
	public void zahleGehalt() {
		geld += GEHALT;
	}
	
}

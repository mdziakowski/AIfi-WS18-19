package uebung9;

class Doktor implements Mitarbeiter{
	private int kontostand;

	@Override
	public void zahleGehalt() {
		kontostand += gehalt;
	}

}

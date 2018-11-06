package Aufgabenblätter;

public class Rational {

	int zaehler, nenner;
	// int nenner;

	public Rational() {

		zaehler = 0;
		nenner = 1;

	}

	public void printRational() {

		System.out.println("Das Ergebnis lautet: " + zaehler + "/" + nenner);

	}

	public void setNenner(int i) {

		this.nenner = i;

	}

	public void setZaehler(int i) {

		this.zaehler = i;

	}

	public Rational(int i, int j) {

		this.nenner = i;
		this.zaehler = j;

	}

	public void negate() {

		this.zaehler = zaehler * -1;

	}
	
	public void invert() {
		
		int a = this.zaehler;
		this.zaehler = this.nenner;
		this.nenner = a;
		
	}
	
	public void toDouble() {
		
		
		
	}

	public static void main(String[] args) {

		double loesung;

		// loesung = zahl1.zaeler / zahl1.nenner;

		Rational zahl1 = new Rational();

		zahl1.setZaehler(5);
		zahl1.setNenner(9);

		zahl1.negate();
		zahl1.invert();

		loesung = (zahl1.zaehler / zahl1.nenner);

		System.out.println("Zähler: " + zahl1.zaehler);
		System.out.println("Nenner: " + zahl1.nenner);

		System.out.println("Lösung: " + loesung);

	}

}

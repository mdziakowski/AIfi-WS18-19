package Aufgabenblätter;

public class Rational {

	int zaeler, nenner;
	// int nenner;

	public Rational() {

		zaeler = 0;
		nenner = 1;

	}

	public void printRational() {

		System.out.println("Das Ergebnis lautet: " + (zaeler / nenner));

	}

	public void setNenner(int i) {

		this.nenner = i;

	}

	public void setZaeler(int i) {

		this.zaeler = i;

	}

	public Rational(int i, int j) {

		this.nenner = i;
		this.zaeler = j;

	}

	public void negate() {

		this.zaeler = zaeler * -1;

	}

	public static void main(String[] args) {

		double loesung;

		// loesung = zahl1.zaeler / zahl1.nenner;

		Rational zahl1 = new Rational();

		zahl1.setZaeler(5);
		zahl1.setNenner(9);

		zahl1.negate();

		loesung = zahl1.zaeler / zahl1.nenner;

		System.out.println("Zähler: " + zahl1.zaeler);
		System.out.println("Nenner: " + zahl1.nenner);

		System.out.println("Lösung: " + loesung);

	}

}

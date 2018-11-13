package Aufgabe2;

public class Rational {
	
	// Instanzvariablen definieren
	int zaehler;
	int nenner;
	
	// Konstruktoren
	Rational() {
		this.zaehler = 0;
		this.nenner = 1;
	}
	
	Rational(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	// Methoden
	
	// Rationalzahl ausgeben
	private double printRational() {
		return ((double)zaehler / nenner);  // zum Typ "double" umwandeln
	}
	
	// das Vorzeichen der Rationalzahl umkehren
	private void negate() {
		this.zaehler *= -1;
	}
	
	// Zähler und Nenner vertauschen
	private void invert() {
		// null als Nenner werden?
		if (zaehler == 0) {
			System.out.println("Fehler: divide by 0");
		} else {  // Kehrwert berechnen
			int zaehlerTmp = zaehler;
			int nennerTmp = nenner;
			this.zaehler = nennerTmp;
			this.nenner = zaehlerTmp;
		}
	}
	
	// Rationalzahl als Typ "double" zurückgeben
	private double toDouble() {
		return ((double)zaehler / nenner);
	}
	
	// Bruch kürzen
	private void reduce() {
		// null als Nenner?
		if (nenner == 0) {
			System.out.println("Fehler: Divide by 0");
		} else {  // Bruch kürzen
			int gcd = GCD(zaehler, nenner);  // GCD berechnen
			if (gcd == 1) {  // Bruch kann nicht weiter gekürzt werden
				System.out.println("Bruch kann nicht weiter gekürzt werden");
			} else {  // Bruch kann weiter gekürzt werden
				this.zaehler /= gcd; // gekürzter Zähler berechnen
				this.nenner /= gcd;  // gekürzter Nenner berechnen
				System.out.println("Gekürzt: " + this.zaehler + "/" + this.nenner);
			}
		}
	}
	
	// GCD berechnen
	public int GCD(int num, int den) {
		if (den == 0) {
			return num;
		}
		return GCD(den, num % den);
	}
	
	// Rationals addieren
	private void add(Rational anderesRational) {
		this.zaehler = this.zaehler * anderesRational.getNenner() + 
				anderesRational.getZaehler() * this.nenner;  // neuer Zähler
		this.nenner = this.nenner * anderesRational.getNenner();  // neuer Nenner
	}
	
	// Getters und Setters
	
	// Zähler setzen
	private void setZaehler(int tmp) {
		zaehler = tmp;
	}
	
	// Nenner setzen
	private void setNenner(int tmp) {
		nenner = tmp;
	}
	
	// Zähler abrufen
	private int getZaehler() {
		return this.zaehler;
	}
	
	// Nenner abrufen
	private int getNenner() {
		return this.nenner;
	}
	
	// main-Methode
	public static void main (String[] args) {
		// neue Rationalzahl definieren (erster Konstruktor, ohne Argumente)
		Rational rational = new Rational(); 
		
		// Zähler und Nenner setzen
		rational.setZaehler(8);
		rational.setNenner(6);
		
		// Rationalzahl ausgeben (erster Konstruktor, ohne Argumente)
		System.out.println("rational = " + rational.printRational());
		
		// Das Verzeichnis der Rationalzahl umkehren
		rational.negate();  // zu negative umkehren
		System.out.println("rational (negative) = " + rational.printRational());
		rational.negate();  // zu positive umkehren
		System.out.println("rational (positive) = " + rational.printRational());
		
		// Der Zähler und der Nenner vertauschen
		rational.invert();  // Kehrwert
		System.out.println("Kehrwert der rational = " + rational.printRational());
		rational.invert();  // wieder zu normal
		System.out.println("Kehrwert des Kehrwerts der rational = " + rational.printRational());
		
		// toDouble testen
		System.out.println("rational mit dem double Typ = " + rational.toDouble());
		
		// Der Bruch der Rationalzahl kürzen
		rational.reduce();
		
		// zweites Rational definieren
		Rational rational2 = new Rational(1, 2);
		
		// Der Wert des rational2 ausgeben
		System.out.println("rational2 = " + rational2.printRational());
		
		// zum rational rational2 addieren
		rational.add(rational2);
		System.out.println("rational1 + rational = " + rational.printRational());
	}
}

package hausaufgaben.aufgabenblatt2;

class Rational {
	int zaehler;
	int nenner;
	
	/////////////////////////Konstruktoren
	public Rational() {
		zaehler=0;
		nenner=1;
	}
	public Rational(int nenner, int zaehler) {
		this.zaehler=zaehler;
		this.nenner=nenner;
	}
	
	///////////////////////Main
	public static void main (String args[]) {
		System.out.println("Erste rationale Zahl");
		Rational zahl1 = new Rational();
		zahl1.printRational();
		zahl1.setNenner(123);
		zahl1.setZaehler(12	);
		zahl1.printRational();
		
		System.out.println("\nZweite rationale Zahl");
		Rational zahl2 = new Rational(5,16);
		zahl2.printRational();
		
		System.out.println("\nzahl2 negieren");
		zahl2.negate();
		zahl2.printRational();
		
		System.out.println("\nnegierte zahl2 invertieren");
		zahl2.invert();
		zahl2.printRational();
		
		System.out.println("\nzahl2 als double-Ausgabe");
		double rational2 = zahl2.toDouble();
		System.out.println(rational2);
		
		System.out.println("\nzahl3 Kürzen");
		Rational zahl3 = new Rational(400,600);
		Rational reduziert = zahl3.reduce();
	}

	////////////////////Methoden	

	public void printRational() {
		double rational = zaehler/nenner;
		System.out.println("Der Zähler beträgt: "+ zaehler +" der Nenner: " + nenner);
		System.out.println("Die rationale Zahl ist: " + rational);
	}
	
	public  void setZaehler(int zaehler) {
		this.zaehler=zaehler;		
	}
	
	public void setNenner(int nenner) {
		this.nenner=nenner;
	}
	
	public void negate() {
		nenner=nenner*(-1);
		zaehler=zaehler*(-1);
	}
	
	public void invert() {
		int zaehler_alt = zaehler;
		int nenner_alt = nenner;
		zaehler = nenner_alt;
		nenner = zaehler_alt;
	}
	
	public double toDouble() {
		double rational_d = zaehler/nenner;
		return rational_d;
	}
	
	public static int ggT (int number1, int number2) {
		if (number2==0) {
			return number1;
		}
		return ggT(number2,number1%number2);
	}
	
	public Rational reduce() {
		int ggt = ggT(this.zaehler, this.nenner);
		Rational gekuerzt = new Rational(this.zaehler/ggt,this.nenner/ggt);
		gekuerzt.printRational();
		return gekuerzt;
	}
	
}

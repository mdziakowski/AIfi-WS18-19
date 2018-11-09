package hausaufgaben.aufgabenblatt2;

class Rational {

	int nenner;
	int zaehler;
	double kommazahl;
	
	Rational(int zaehler, int nenner) {
		this.nenner=nenner;
		this.zaehler=zaehler;
		this.kommazahl=(double)nenner/(double)zaehler;
	}
	Rational(){
		this.nenner=1;
		this.zaehler=0;
		kommazahl=0;
	}
	
	public static void main(String[] args) {
		
	}
	
	public  void setZaehler(int zaehler) {
		this.zaehler=zaehler;		
	}
	
	public void setNenner(int nenner) {
		this.nenner=nenner;
	}
	
	public void printRational() {
		double rational = (double)zaehler/nenner;
		System.out.println("Der Zähler beträgt: "+ zaehler +" der Nenner: " + nenner);
		System.out.println("Die rationale Zahl ist: " + rational);
	}

	
	public void negate() {
		this.nenner=this.nenner*(-1);
		this.zaehler=this.zaehler*(-1);
	}
	
	public void invert() {
		int zaehler_alt = this.zaehler;
		int nenner_alt = this.nenner;
		this.zaehler = nenner_alt;
		this.nenner = zaehler_alt;
	}
	
	public void toDouble() {
		this.kommazahl=(double)zaehler/(double)nenner;
		System.out.println("Die rationale Zahl beträgt: " + this.kommazahl);
	}
	
	public static int ggT (int number1, int number2) {
		if (number2==0) {
			return number1;
		}
		return ggT(number2,number1%number2);
	}
	
	public void reduce() {
		int ggt = ggT(this.zaehler, this.nenner);
		this.zaehler=this.zaehler/ggt;
		this.nenner=this.nenner/ggt;
	}
	
	public void add(Rational r1) {
		this.kommazahl=this.kommazahl + ((double)r1.zaehler/(double)r1.nenner);
		System.out.println("Das neue Rational ist: " + this);
		// Wie kann ich hier das aktuelle Rational ausgeben, zu dem ich ein neues addiert habe?
		// Wenn du nur die Zahl haben willst, kannst du this.kommazahl nehmen
	}

}

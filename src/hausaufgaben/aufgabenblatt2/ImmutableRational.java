package hausaufgaben.aufgabenblatt2;

class ImmutableRational {
	int zaehler;
	int nenner;
	double kommazahl;
	
	/////////////////////////Konstruktoren
	public ImmutableRational() {
		zaehler=0;
		nenner=1;
		kommazahl=(double)zaehler/(double)nenner;
	}
	public ImmutableRational(int zaehler, int nenner) {
		this.zaehler=zaehler;
		this.nenner=nenner;
		this.kommazahl=(double)zaehler/(double)nenner;
	}
	
	///////////////////////Main
	public static void main (String args[]) {
		
	}

	////////////////////Methoden	

	public void printRational() {
		System.out.println("Der Zähler beträgt: "+ zaehler +" der Nenner: " + nenner);
		System.out.println("Die rationale Zahl ist: " + kommazahl);
	}
	
	public ImmutableRational negate() {
		ImmutableRational neueZahl = new ImmutableRational(this.zaehler,this.nenner);
		neueZahl.nenner=this.nenner*(-1);
		neueZahl.zaehler=this.zaehler*(-1);
		return neueZahl;
	}
	
	public ImmutableRational invert() {
		ImmutableRational neueZahl = new ImmutableRational(this.zaehler,this.nenner);
		int zaehler_alt = this.zaehler;
		int nenner_alt = this.nenner;
		neueZahl.zaehler = nenner_alt;
		neueZahl.nenner = zaehler_alt;
		return neueZahl;
	}
	
	public Double toDouble() {
		double rational_d = (double)zaehler/(double)nenner;
		return rational_d;
	}
	
	public static int ggT (int number1, int number2) {
		if (number2==0) {
			return number1;
		}
		return ggT(number2,number1%number2);
	}
	
	public ImmutableRational reduce() {
		int ggt = ggT(this.zaehler, this.nenner);
		ImmutableRational gekuerzt = new ImmutableRational(this.zaehler/ggt,this.nenner/ggt);
		return gekuerzt;
	}
	
	public double add(ImmutableRational r1) {
		double neuesRational = ((double)this.zaehler/(double)this.nenner)+((double)r1.zaehler/(double)r1.nenner);
		return neuesRational;
	}
	
}

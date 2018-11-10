package ha2;

class Rational {
	int zahler;
	int nenner;
	int help;
	
	Rational() {
		zahler = 0;
		nenner = 1;
	}
	
	Rational(int zahler, int nenner) {
		this.nenner = nenner;
		this.zahler = zahler;
	}
	
	void printRational() {
		System.out.println(zahler + "/" + nenner);
	}
	
	void setRational(int zahler, int nenner) {
		this.zahler = zahler;
		this.nenner = nenner;
	}
	
	void negate() {
		zahler = -zahler;
	}
	
	void invert() {
		help = zahler;
		zahler = nenner;
		nenner = help;
	}
	
	double toDouble() {
		double number = (double)zahler/nenner;
		return number;
	}
	
	 static int ggt(int zahl1, int zahl2) {
		   while (zahl2 != 0) {
		     if (zahl1 > zahl2) {
		       zahl1 = zahl1 - zahl2;
		     } else {
		       zahl2 = zahl2 - zahl1;
		     }
		   }
		   return zahl1;
		 }
	
	void reduce() {
		help = ggt(zahler, nenner);
		zahler = zahler / help;
		nenner = nenner / help;
	}
	
	void add(int newZahler, int newNenner) {
		nenner = nenner * newNenner;
		zahler = zahler * newNenner + newZahler * nenner;
		help = ggt(zahler, nenner);
		nenner = nenner / help;
		zahler = zahler / help;
	}
}

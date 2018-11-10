package ha2;

class ImmutableRational {
	int zahler;
	int nenner;
	
	ImmutableRational() {
		zahler = 0;
		nenner = 1;
	}
	
	ImmutableRational(int zahler, int nenner) {
		this.nenner = nenner;
		this.zahler = zahler;
	}
	
	void printRational() {
		System.out.println(zahler + "/" + nenner);
	}
	
	int[] negate() {
		int negated[] = new int [2];
		negated[0] = -zahler;
		negated[1] = nenner;
		return negated;
	}
	
	int[] invert() {
		int inverted[] = new int [2];
		inverted[0] = nenner;
		inverted[1] = zahler;
		return inverted;
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
	
	int[] reduce() {
		int reduced[] = new int[2];
		int help = ggt(zahler, nenner);
		reduced[0] = zahler / help;
		reduced[1] = nenner / help;
		return reduced;
	}
	
	int[] add(int newZahler, int newNenner) {
		int added[] = new int [2];
		added[1] = nenner * newNenner;
		added[0] = zahler * newNenner + newZahler * nenner;
		return added;
	}
}

package uebung2;

public class Aufgabe3 {
	
	public static void main(String[] args) {
		
		int n = 49; int k = 6; double binom;
		
		binom = myBinom(n, k);
		
		
		System.out.println("Der Binomialkoeffizent von n = " + n + " über k = " + k + " ist " + binom);
			
	}

	// Methode zur Berechnung des Binomialkoeffizienten:
	public static double myBinom(int n, int k) {
		double binom;
		binom = myFac(n, 1.) / (myFac(k, 1.)*myFac(n-k, 1.));
		return binom;
	}

	// Methode zur Berechnung der Fakultät:
	public static double myFac(int fak, double faklt) {
		for (int ii = 1; ii <= fak; ii++) {
			faklt = faklt*ii;
		}
		return faklt;
	}

}

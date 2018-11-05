package hausaufgabe2;

public class Rational {
	
	// Instanzvariablen (1)
	private int zaehler;
	private int nenner;
		
		//Konstruktor ohne Argumente (2)
		public Rational() {
			zaehler = 0;
			nenner = 1;
		}
		
		//zweiter Konstruktor (6)
		public Rational(int z, int n) {
			zaehler = z;
			
			if(n==0) {
				System.out.println("Der Nenner darf nicht 0 sein.");		
				nenner = 1;
			}else {
			nenner = n;
			}
		}
		
		//Methode für die Ausgabe (3)
		public void printRational() {
			System.out.println("rationale Zahl als Bruch: " + zaehler + "/" + nenner);
		}
		
		//Methode zum festlegen des Zaehlers und Nenners(4)
		public void setZaehler (int zahl) {
			zaehler = zahl;
		}
		
		public int getZaehler() {
			return zaehler;
		}
		
		public void setNenner (int zahl) {
			if (zahl==0) {
				System.out.println("Nenner darf nicht 0 sein");
			}else {
			nenner = zahl;
			}
		}
		
		public int getNenner () {
			return nenner; 
		}
		
		//Methode negate (7)
		public void negate() {
			zaehler = zaehler * (-1);	
		}
		
		//Methode invert (8)
		public void invert () {	
			int altNenner = nenner;
			nenner = zaehler;
			zaehler = altNenner; 
		}
		
		//Methode toDouble (9)
		public double toDouble() { 
			return (double) zaehler/nenner;
		}
		
		//Methode reduce (10)
		public void reduce () {
			int ggT = ggT(zaehler,nenner);
			zaehler = zaehler/ggT;
			nenner = nenner/ggT;			
		}
		
		// Methode ggT nach Euklidischen Algorithmus 
		private int ggT(int zaehler, int nenner) {
			   while (nenner != 0) {
			     if (zaehler > nenner) {
			       zaehler = zaehler - nenner;
			     } else {
			       nenner = nenner - zaehler;
			     }
			   }
			   return zaehler;
		}
		// Methode add (11)
		public void add(Rational summand) {
			zaehler = zaehler * summand.getNenner() + summand.getZaehler() * nenner;
			nenner = nenner * summand.getNenner();			
		}
}

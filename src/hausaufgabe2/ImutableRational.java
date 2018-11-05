package hausaufgabe2;

public class ImutableRational {
	
	// Instanzvariablen (1)
		private int zaehler;
		private int nenner;
			
			//Konstruktor ohne Argumente (2)
			public ImutableRational() {
				zaehler = 0;
				nenner = 1;
			}
			
			//zweiter Konstruktor (6)
			public ImutableRational (int z, int n) {
				zaehler = z;
				
				if(n==0) {
					System.out.println("Der Nenner darf nicht 0 sein.");		
					nenner = 1;
				}else {
				nenner = n;
				}
			}
			
			//Methode für die Ausgabe (3)
			public void printImutableRational() {
				System.out.println("rationale Zahl als Bruch: " + zaehler + "/" + nenner);
			}
			
			//Methode zum festlegen des Zaehlers und Nenners(4)
			public int getZaehler() {
				return zaehler;
			}
			
			public int getNenner () {
				return nenner; 
			}
			
			//Methode negate (7)
			public ImutableRational negate() {
				return new ImutableRational (zaehler * (-1), nenner);				
			} 
				
			//Methode invert (8)
			public ImutableRational invert() {
				return new ImutableRational (nenner,zaehler);
			}
			
			//Methode toDouble (9)
			public double toDouble() {
				double toDouble = (double) zaehler/nenner;
				return toDouble; 
				//return zaehler/nenner;
			}
			
			//Methode reduce (10)
			public ImutableRational reduce () {
				int ggT = ggT(zaehler,nenner);
				return new ImutableRational(zaehler/ggT,nenner/ggT);			
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
			public ImutableRational add (ImutableRational summand) {
				return new ImutableRational(zaehler * summand.getNenner() + summand.getZaehler() * nenner,nenner * summand.getNenner());	
			}
}

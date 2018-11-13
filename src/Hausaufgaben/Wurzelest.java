package Hausaufgaben;

public class Wurzelest {
	public static void main(String[] args) {	
	double a=9.0, xneu=a/2, xalt=a; // Wert für a hier eingeben
	boolean abbr=false;
	int i = 0;
		
	// Kommentare zur Fehlersuche
	
		while (abbr== false) {
			if ((xalt- xneu) <= 0.0001){
				System.out.println("Die Wurzel aus " + a + " kann annährend genau mit " + xneu + " abgegeben werden");
				System.out.println("Dafür hat es: " + i + " Durchläufe gebraucht");
				abbr = true;
			}
			else {
				xalt = xneu;
				xneu = (xalt + (a/xalt)) /2;
//				System.out.println("Schleifendurchlauf: " + i);
//				System.out.println(xneu);
				i++;
//	}
			}
		}}}



package Aufgabe1;

public class QuadratWurzel {

	public static void main(String[] args) {
		// TODO bearbeite hier die Aufgabe aus dem freiwilligen Aufgabenblatt 1 und commite deine Loesung in deinem Branch. Viel SpaÃŸ :)
		// Input (a, von dem die Quadratwurzel kalkulieren wird) und x0 definieren
		double a = 9.0; 
		double x0 = 4.5;  // a/2
		
		// erste Einschätzung von x1 (Quadratwurzel)
		double x1 = calcSqrt(a, x0);
		
		// iterative Methode laufen bis der Unterschied zwischen die aktuelle Loesung 
		// und vorherige Loesung < 0.0001 ist
		while (Math.abs(x1 - x0) >= 0.0001) {
			x0 = x1;  // Quadratwurzel "erste Loesung" wieder definieren
			x1 = calcSqrt(a, x0);
		}
		
		// Lösung ausgeben
		System.out.println("Die Quadratwurzel von " + a + " ist " + x1);
	}
	
	// Quadratwurzel iterativ kalkulieren
	private static double calcSqrt(double input, double ersteLoesung) {
		double quadratWurzel = (ersteLoesung + (input / ersteLoesung)) / 2.0;
		return quadratWurzel;
		
	}

}


package hausaufgabe2;

public class ImutableRationaleZahlen {
	public static void main (String[] args){
		
		// Main Programm unter ausschliesslicher Verwendung von seiteneffektfreien Methoden. 
		
		//Erzeugen eines Objekts vom Typ Rational, Zaehler und Nenner setzen und Ausgabe (5)
		ImutableRational zahl0 = new ImutableRational(5,10);
		System.out.println("Aufgabe 1.5: ");
		System.out.println("Zähler: " + zahl0.getZaehler());
		System.out.println("Nenner: " + zahl0.getNenner());
		zahl0.printImutableRational();
		
		//Methode negate aufrufen (7)
		ImutableRational zahl1 = new ImutableRational(1,4);
		System.out.println();
		System.out.println("Aufgabe 1.7: ");
		zahl1.printImutableRational();
		ImutableRational negativ = zahl1.negate();
		negativ.printImutableRational();
		
		//Methode invert aufrufen (8)
		System.out.println();
		System.out.println("Aufgabe 1.8: ");
		ImutableRational zahl2 = new ImutableRational(4,8);
		zahl2.printImutableRational();
		ImutableRational invertiert= zahl2.invert();
		invertiert.printImutableRational();
		
		//Methode toDouble aufrufen (9)
		System.out.println();
		System.out.println("Aufgabe 1.9: ");
		ImutableRational zahl3 = new ImutableRational(5,2);
		zahl3.printImutableRational();
		System.out.println("rationale Zahl als Dezimalzahl: " + zahl3.toDouble());
		
		//Methode reduce aufrufen (10)
		System.out.println();
		System.out.println("Aufgabe 1.10: ");
		ImutableRational zahl4 = new ImutableRational(5,10);
		zahl4.printImutableRational();
		ImutableRational gekuerzt = zahl4.reduce();
		gekuerzt.printImutableRational();
		
		//Methode add aufrufen (11)
		System.out.println();
		System.out.println("Aufgabe 1.11: ");
		ImutableRational zahl5 = new ImutableRational(1,2);
		ImutableRational zahl6 = new ImutableRational(2,3);
		zahl5.printImutableRational();
		zahl6.printImutableRational();
		System.out.println("Die Summe der beiden Brüche ist: ");
		ImutableRational addiere = zahl5.add(zahl6);
		addiere.printImutableRational();
	}
}
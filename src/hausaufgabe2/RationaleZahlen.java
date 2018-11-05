package hausaufgabe2;

public class RationaleZahlen {
	public static void main (String[] args){
		
		// Main Programm unter ausschließlicher Verwendung von modifizierenden Methoden.
		
		//Erzeugen eines Objekts vom Typ Rational, Zaehler und Nenner setzen und Ausgabe (5)
		Rational zahl0 = new Rational();
		zahl0.setZaehler(5);
		zahl0.setNenner(10);
		System.out.println("Aufgabe 1.5: ");
		System.out.println("Zähler: " + zahl0.getZaehler());
		System.out.println("Nenner: " + zahl0.getNenner());
		zahl0.printRational();
			
		//Methode negate aufrufen (7)
		Rational zahl1 = new Rational(1,4);
		System.out.println();
		System.out.println("Aufgabe 1.7: ");
		zahl1.printRational();
		zahl1.negate();
		zahl1.printRational();
		
		//Methode invert aufrufen (8)
		System.out.println();
		System.out.println("Aufgabe 1.8: ");
		Rational zahl2 = new Rational(4,8);
		zahl2.printRational();
		zahl2.invert();
		zahl2.printRational();
		
		//Methode toDouble aufrufen (9)
		System.out.println();
		System.out.println("Aufgabe 1.9: ");
		Rational zahl3 = new Rational(5,2);
		zahl3.printRational();
		System.out.println("rationale Zahl als Dezimalzahl: " + zahl3.toDouble());
		
		//Methode reduce aufrufen (10)
		System.out.println();
		System.out.println("Aufgabe 1.10: ");
		Rational zahl4 = new Rational(5,10);
		zahl4.printRational();
		zahl4.reduce();
		zahl4.printRational();
		
		//Methode add aufrufen (11)
		System.out.println();
		System.out.println("Aufgabe 1.11: ");
		Rational zahl5 = new Rational(1,2);
		Rational zahl6 = new Rational(2,3);
		zahl5.printRational();
		zahl6.printRational();
		System.out.println("Die Summe der beiden Brüche ist: ");
		zahl5.add(zahl6);
		zahl5.printRational();
	}
}

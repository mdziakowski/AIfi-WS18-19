package freiwilligeHausaufgaben.aufgabenblatt_2;


public class Aufgabe2 {
	
	public static void main(String[] args) {
		
		Rational z1 = new Rational();
		
		int zaehler = 142;
		int nenner = 18;
		
		z1.setZaehler(zaehler);
		z1.setNenner(nenner);
		
		
		z1.printRational();
		System.out.println("Die eingegebene rationale Zahle lautet: " + z1.printRational() +  " = " + z1.toDouble());
		
		Rational z2 = new Rational(zaehler, nenner);
		z2.reduce();
		
		z2.negate();
		System.out.println("Die Umkehrung davon ist: " + z2.printRational() + " = " + z2.toDouble());
		
		z2.invert();
		System.out.println("Und der Kehrwert davon ist: " + z2.printRational() + " = " + z2.toDouble());
		
		z1.add(z2);
		System.out.println("Die Summe des ursprünglichen Werts und seinem umgekehrten Kehrwert ist: " + z1.printRational() + " = " + z1.toDouble());
	
		z2.reduce();
		
	}

}
package zusatzuebung;

import java.util.Scanner;

public class Taschenrechner {
	double result;
	boolean run = true;
	
	
	public static void main(String args[]){
		Taschenrechner t1 = new Taschenrechner ();
		Scanner scanner = new Scanner (System.in);
		
		while (t1.run == true ) {
		
		System.out.println("Gib die Rechenoperation ein!");
		String operation = scanner.next();
		
		switch (operation) {
			case "+": t1.plus(getZahl(scanner)); break;
			case "-": t1.minus(getZahl(scanner)); break;
			case "/": t1.geteilt(getZahl(scanner)); break;
			case "*": t1.mal(getZahl(scanner)); break;
			case "exit": return;
			default: System.out.println("Dies ist keine bereitgestellte Rechenoperation."); break;
		}

		System.out.println("Das Ergebnis ist: " + t1.result);
		
		}
	}

	private static double getZahl(Scanner scanner) {
		System.out.println("Gib eine Zahl ein!");
		double zahl = scanner.nextDouble();
		return zahl;
	}
	
	void reset(){
		result = 0;
	}
	
	void plus(double tmp) {
		this.result += tmp;
	}
	
	void minus(double tmp) {
		this.result -= tmp;
	}
	
	void geteilt(double tmp) {
		this.result /= tmp;
	}
	
	void mal(double tmp) {
		this.result *= tmp;
	}
	
	double getResult(){
		return result;
	}

}

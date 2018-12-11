package uebung9;

import java.util.Scanner;

class TaschenrechnerMain {

	public static void main(String[] args) {
		
		Taschenrechner rechner = new Taschenrechner();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter the desired operation (+, -, *, /, reset, close):");
			String operation = scanner.next();
		
			switch(operation) {
				case "+":
					System.out.println("Please enter the desired number to add:");
					rechner.add(scanner.nextDouble());
					break;
				case "-":
					System.out.println("Please enter the desired number to substract:");
					rechner.substract(scanner.nextDouble());
					break;
				case "*":
					System.out.println("Please enter the desired number to multiply:");
					rechner.multiply(scanner.nextDouble());
					break;
				case "/":
					System.out.println("Please enter the desired number to divide:");
					rechner.divide(scanner.nextDouble());
					break;
				case "reset":
					rechner.reset();
					break;
				case "close":
					scanner.close();
					return;
				default:
					System.out.println("Input not valid!");
					break;
			}
			System.out.println("Result: " + rechner.getResult());
		}
	}

}

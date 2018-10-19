package uebung1;

public class Calculator {

	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		
		int sum = a + b;
		int diff = a - b;
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + diff);
		
		System.out.println(a + b + " ist die Lösung");
		System.out.println("Lösung: " + a + b);
		System.out.println("Lösung: " + (a + b));
		
	}

}

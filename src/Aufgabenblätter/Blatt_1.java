package Aufgabenblätter;

public class Blatt_1 {

	public static void main(String[] args) {

		double a = 12345678;
		double x_0 = a / 2;
		double x_1 = (x_0 + (a / x_0)) / (2);

		while (Math.abs(x_0 - x_1) > 0.0001) {

			x_0 = x_1;

			x_1 = (x_0 + (a / x_0)) / (2);

		}

		System.out.println("Die Wurzel von " + a + " ist ungefähr: " + x_1);
		// System.out.printf("Die Wurzel von " + %lf + " ist ungefähr: " + %lf; a, x_1);
		

	}

}

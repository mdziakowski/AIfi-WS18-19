package uebung2;

public class Wurzel {

	public static void main(String[] args) {
		int n = 1764;
		int sqr = 0;
		int result;
		do {
			sqr++;
			result = sqr * sqr;
		} while (result < n);
		if (result == n) {
			System.out.println("Die Wurzel aus " + n + " ist " + sqr);
		} else {
			System.out.println("Keine Wurzel für " + n + " gefunden.");
			System.out.println("Die nächst größere Zahl mit einer Wurzel " + "in den natürlichen Zahlen ist "
					+ result + " die Wurzel ist " + sqr);
		}
	}

}

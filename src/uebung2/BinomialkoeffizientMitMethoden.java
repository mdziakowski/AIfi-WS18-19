package uebung2;

public class BinomialkoeffizientMitMethoden {

	public static void main(String[] args) {
		int n = 49;
		int k = 6;
		double binomCoefficient = calcBinomCo(n, k);
		System.out.println("Der Binomialkoeffizient " + n + " ueber " + k + " ist " + binomCoefficient);
	}

	private static double calcFactorial(long basis) {
		double result = 1.0;
		for (int i = 1; i <= basis; i++) {
			result = result * i;
		}
		return result;
	}

	private static double calcBinomCo(int n, int k) {
		double binomCoefficient;
		binomCoefficient = calcFactorial(n) / (calcFactorial(k) * calcFactorial(n - k));
		return binomCoefficient;
	}

}

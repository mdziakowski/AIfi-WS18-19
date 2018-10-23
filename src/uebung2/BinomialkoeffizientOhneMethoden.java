package uebung2;

public class BinomialkoeffizientOhneMethoden {

	public static void main(String[] args) {
		int n = 49;
		int k = 6;
		// Fakultaet von n
		double nFaku = 1;
		for (int i = 1; i <= n; i++) {
			nFaku = nFaku * i;
		}
		// Fakultaet von k
		double kFaku = 1;
		for (int i = 1; i <= k; i++) {
			kFaku = kFaku * i;
		}
		// Fakultaet von n-k
		double nMkFaku = 1;
		for (int i = 1; i <= (n - k); i++) {
			nMkFaku = nMkFaku * i;
		}
		// Binomialkoeffizient
		double biko = nFaku / (kFaku * nMkFaku);
		System.out.println("Der Binomialkoeffizient von " + n + " über " + k + " beträgt " + biko);
	}

}

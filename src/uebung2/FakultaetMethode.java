package uebung2;

public class FakultaetMethode {

	static void berechne(int zahl, long fac) {
		for (int i=1; i<=zahl; i++) {
			fac = i*fac;
		}
		System.out.println(fac);
	}
// test
}

package uebung2;

public class FakultaetMethode {

	static void berechne(int zahl, long fak) {
		for (int i=1; i<=zahl; i++) {
			fak = i*fak;
		}
		System.out.println(fak);
	}
// test
}

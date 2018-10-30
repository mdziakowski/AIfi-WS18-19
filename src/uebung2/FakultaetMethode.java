package uebung2;

public class FakultaetMethode {

	static void berechne(int no, long fac) {
		for (int i=1; i<=no; i++) {
			fac = i*fac;
		}
		System.out.println(fac);
	}
// test
	
}

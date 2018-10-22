package uebung2;

public class FakultaetFor {

	public static void main(String[] args) {
		int no = 5;
		long fac = 1;
		
		for (int i=1; i<=no; i++) {
			fac = i*fac;
		}
		System.out.println(fac);
	}

}

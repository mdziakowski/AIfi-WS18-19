package uebung1;

public class FakultaetWhile {

	public static void main(String[] args) {
		int no = 5;
		long fac = 1;
		int i = 1;
		
		while (i <= no) {
			fac = i * fac;
			i++;
		}
		System.out.println(fac);
	}

}

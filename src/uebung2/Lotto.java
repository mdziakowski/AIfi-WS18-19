package uebung2;

public class Lotto {

	public static void main(String[] args) {
		int Kugeln = 49;
		int Zuege = 6;
		
		System.out.println(binom(Kugeln,Zuege));

	}
	
	public static double fak (int zahl_fak){
		double ausgabe_fak=1;
		for (int i=1;i<=zahl_fak;i++){
		ausgabe_fak=ausgabe_fak*i;			
		}
		return ausgabe_fak;
	}
	
	public static double binom (int n, int k){
			double nuk;
			nuk = fak(n)/(fak(k)*fak(n-k));		
		return nuk;
	}
	}

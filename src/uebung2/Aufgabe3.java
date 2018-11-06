package uebung2;

public class Aufgabe3 {

	public static void main(String[] args) {

	
	System.out.println(BinKo(49, 6));
		
	}

	public static double Fac(double aa) 
	{
		double bb = 1;
		for (double i=1; i<(aa+1); i++) {
			bb = i*bb;
		}
		return bb;
	}
	
	public static double BinKo (double nn, double kk)
	{
		
		double ee = (Fac(nn)/(Fac(kk)*Fac(nn-kk)));
		
		return ee;
		
		
	}}



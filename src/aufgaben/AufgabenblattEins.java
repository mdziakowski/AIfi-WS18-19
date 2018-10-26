package aufgaben;

public class AufgabenblattEins {

	public static void main(String[] args) {

		
		final double wert = 9;
		final double genauigkeit = 0.0001;
		System.out.println("Die Wurzel von " + wert + " ist in etwa " + Formel(wert/2, wert, genauigkeit) + ", bei einer Genauigkeit von " + genauigkeit + ".");
		
	}
	
	
	public static double Formel (double nn, double wert, double genauigkeit)
	{
		double aa = 0;
		
		for ( ; ErgebnisseVergleichen(nn,aa, genauigkeit)==false;)
		
		{aa = nn;
		
		nn = (aa + (wert/aa))/2;
		
		System.out.println(aa);
		}
		
		
		return aa;	
		
	}
	
	public static boolean ErgebnisseVergleichen (double nn , double aa, double genauigkeit)
	{
		if ((nn >= aa) & ((nn-aa) < genauigkeit))
		{return true;}
		
		if ((nn < aa) & ((aa-nn) < genauigkeit))
		{return true;}
		
		else {return false;}
		
		
	}

}

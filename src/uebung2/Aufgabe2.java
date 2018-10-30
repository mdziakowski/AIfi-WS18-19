package uebung2;

public class Aufgabe2 {
	
	public static void main(String[] args) {
		
		int ges = 3; int out;
		out = intSqrt(ges);
		
		System.out.println("Die letzte natürliche Zahl ist " + out);
			
	}

	private static int intSqrt(int ges) {
		int i = 1;
		int abbr = 0;
		double iSquare = 0;
		
		while(iSquare < ges) {
			iSquare = i*i;
			i++;
			if (iSquare > ges) {
				abbr = 1;
				break;
			}
		}
		
		if (abbr == 1) {
			System.out.println(ges + " hat keine natürliche Wurzel");
			
		}
		else {
			System.out.println("Die Wurzel von " + ges + " ist " + (i-1));
		}
		
		return i-1;
	}

}

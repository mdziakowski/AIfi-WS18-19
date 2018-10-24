package uebung2;

public class CalWurzel {
	
	public static void main(String[] args) {
		
		int ges = 2;
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
			
	}

}

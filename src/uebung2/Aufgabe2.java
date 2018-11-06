package uebung2;

public class Aufgabe2 {

	public static void main(String[] args) {

		double zaehlEnde = 100;
		for (int i = -10; i < zaehlEnde; i++)
		{
		double Zahl = i;
		double gerundeteZahl = Math.round(Zahl);		
		if (gerundeteZahl > 0)
			{double wurzel = Math.sqrt(gerundeteZahl);
			System.out.println("Wurzel aus " + i + " ist " + wurzel);}
		else {System.out.println("Eingangszahl ist 0 oder kleiner");}

		}
		
		
	}

}

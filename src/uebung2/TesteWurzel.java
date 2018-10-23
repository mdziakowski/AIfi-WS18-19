package uebung2;

public class TesteWurzel {

	public static void main(String[] args) {
		int zahl= 9;
		
		for (int i = 1; i<zahl;i++){
			int ergebnis = i*i;
			if (ergebnis == zahl){
				System.out.println("Die Wurzel von " + zahl + " ist " + i + ".");
				break;
			} else if (ergebnis > zahl ){
				System.out.println("Es gibt keine Wurzel der natürlichen Zahl " + zahl + ".");
				break;
			}
			
		}

	}

}

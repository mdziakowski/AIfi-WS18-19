package uebung10.vorlageSchiffeVersenken;

public class Spiel {

	public static void main(String[] args) {

		String namePlayer1 = "Spieler 1";
		String namePlayer2 = "Spieler 2";
		int groeﬂe = 10;
		
		SchiffeversenkenPvP spiel = SchiffeversenkenPvP.startGame(namePlayer1, namePlayer2, groeﬂe);
		
//		int[] schiffe = {5, 4, 4, 3, 3, 3, 2, 2, 2, 2};
		int[] schiffe = {2};
		
		System.out.println(spiel.player1.getName() + ": Schiffe plazieren");
		for (int schiff : schiffe ) {
			spiel.player1.addSchiff(schiff);
		}
		spiel.clearConsole();
		System.out.println(spiel.player2.getName() + ": Schiffe plazieren");
		for (int schiff : schiffe ) {
			spiel.player2.addSchiff(schiff);
		}
		spiel.clearConsole();
		
		int x = 1;
		while(spiel.player1.alleVersenkt() && spiel.player2.alleVersenkt()) {
			if (x == 1) {
				spiel.warte();
				spiel.player2.getLetzterSchuss();
				spiel.player1.showWorld();
				spiel.player1.schuss();
				spiel.player1.showWorld();
				spiel.warte();
				spiel.clearConsole();
				x++;
			} else {
				spiel.warte();
				spiel.player1.getLetzterSchuss();
				spiel.player2.showWorld();
				spiel.player2.schuss();
				spiel.player2.showWorld();
				spiel.warte();
				spiel.clearConsole();
				x = 1;
			}	
		}
		
		spiel.showGrid();
		if (!spiel.player1.alleVersenkt()) {
			System.out.println("Spieler: " + spiel.player2.getName() + " hat gewonnen.");
		}
		if (!spiel.player2.alleVersenkt()) {
			System.out.println("Spieler: " + spiel.player1.getName() + " hat gewonnen.");
		}
	}

}

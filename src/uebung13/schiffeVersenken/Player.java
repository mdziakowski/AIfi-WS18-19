package uebung13.schiffeVersenken;

import java.util.Arrays;
import java.util.Scanner;

public class Player {

	private Player andererPlayer;
	private String name;
	private String[][] schlachtfeld;
	private String[][] spielfeld;
	private String letzterSchuss;
	private static Scanner scanner = new Scanner(System.in);

	Player(String name) {
		this.name = name;
	}
	
	public void addSchiff(int schiff) {
		System.out.println("Welche Richtung für das Schiff(s für senkrecht oder w fuer waagerecht), das Schiff hat eine Laenge von " + schiff + ":");
		String richtung = scanner.next();
		if (richtung.equals("s")) {
			richtung = "senkrecht";
		} else if (richtung.equals("w")) {
			richtung = "waagerecht";
		} else {
			System.out.println("Falsche Eingabe");
			addSchiff(schiff);
			return;
		}
		System.out.println("Wohin(das Schiff hat eine Laenge von " + schiff + ") und steht " + richtung + ":\nx-Koordinate: ");
		int x = scanner.nextInt();
		System.out.println("y-Koordinate: ");
		int y = scanner.nextInt();
		if (richtung.equals("waagerecht") && x > 0 && y > 0 && y + schiff <= spielfeld.length) {
			for (int i = 0; i < schiff; i++) {
				if (!spielfeld[x][y + i].equals(" ")) {
					System.out.println("Da ist bereits ein Schiff");
					addSchiff(schiff);
				}
			}
			for (int i = 0; i < schiff; i++) {
				spielfeld[x][y + i] = "O";
			}
		} else if (richtung.equals("senkrecht") && x > 0 && y > 0 && x + schiff <= spielfeld.length) {
			for (int i = 0; i < schiff; i++) {
				if (!spielfeld[x + i][y].equals(" ")) {
					System.out.println("Da ist bereits ein Schiff");
					addSchiff(schiff);
				}
			}
			for (int i = 0; i < schiff; i++) {
				spielfeld[x + i][y] = "O";
			}
		} else {
			System.out.println("Ungueltige Eingabe.");
			addSchiff(schiff);
		}
		showWorld();
	}

	public void schuss() {
		System.out.println("Wohin:\nx-Koordinate: ");
		int x = scanner.nextInt();
		System.out.println("y-Koordinate: ");
		int y = scanner.nextInt();
		if (x  <= spielfeld.length && x > 0 && y <= spielfeld.length && y > 0) {
			if (andererPlayer.getSpielfeld()[x][y].equals(" ")) {
				andererPlayer.getSpielfeld()[x][y] = "X";
				schlachtfeld[x][y] = "X";
			} else if (andererPlayer.getSpielfeld()[x][y].equals("O")) {
				andererPlayer.getSpielfeld()[x][y] = "0";
				schlachtfeld[x][y] = "0";
				System.out.println("Treffer");
			} else {
				System.out.println("Bereits hin geschossen.");
				schuss();
			}
			letzterSchuss = "Schuss von " + name + " : " + x + ", " + y;
		} else {
			System.out.println("Ungueltige Eingabe");
			schuss();
		}
		
	}
	
	// kommt demnächst
	private boolean nebenanBesetzt(int x, int y) {
		return false;
	}
	
	public void showWorld() {
		System.out.println("Spieler: " + getName() + "\nSchlachtfeld:");
		System.out.println("----------------------------------");
		for (String[] i : this.getSchlachtfeld()) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println("Spielfeld: ");
		System.out.println("----------------------------------");
		for (String[] i : this.getSpielfeld()) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	public boolean alleVersenkt() {
		for (String[] feld : spielfeld) {
			for (String str : feld) {
				if (str.equals("O")) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void getLetzterSchuss() {
		if (letzterSchuss != null) {
			System.out.println(letzterSchuss);
		}
	}
	
	public String[][] getSchlachtfeld() {
		return schlachtfeld;
	}

	public void setSchlachtfeld(String[][] schlachtfeld) {
		this.schlachtfeld = schlachtfeld;
	}

	public String[][] getSpielfeld() {
		return spielfeld;
	}

	public void setSpielfeld(String[][] spielfeld) {
		this.spielfeld = spielfeld;
	}
	
	public void setAndererPlayer(Player player) {
		this.andererPlayer = player;
	}

	public String getName() {
		return name;
	}

}

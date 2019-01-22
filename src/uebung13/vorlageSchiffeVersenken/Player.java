package uebung13.vorlageSchiffeVersenken;

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
	
	/**
	 * Einlesen ob das Schiff senktrecht oder waagerecht schwimmen soll, sowie die x und y Koordinaten.
	 * Danach soll das Schiff auf dem spielfeld platziert werden
	 * @param schiff
	 */
	public void addSchiff(int schiff) {
		
		showWorld();
	}

	/**
	 * Einlesen wohin geschossen wird, dies soll auf deinem schlachtfeld und auf dem spielfeld deines Gegners, je nach dem ob ein
	 * Schiff getroffen wurde, entsprechend markiert werden und als String in der Variablen letzterSchuss gespeichert werden
	 */
	public void schuss() {
		
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

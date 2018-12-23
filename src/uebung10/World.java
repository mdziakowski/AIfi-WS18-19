package uebung10;

import java.util.ArrayList;
import java.util.Scanner;

class World {
	Feld f1 [][];
	ArrayList<Schiff> schiffe = new ArrayList<>();
	

	World(){
		f1 = new Feld[10][10];
		for (int ii = 0 ; ii < 10 ; ii++) {
			for (int kk = 0 ; kk < 10 ; kk++) {
				f1[ii][kk] = new Feld();
			}
		}
	}
	
	
	
	
	
	
	////////////////////////Methoden
	
	void printWorld() {		
		int length = f1.length;
		for (int ii = 0 ; ii<length ; ii++) {
			for (int jj = 0 ; jj < length ; jj++) {
				if (f1[ii][jj].besetzt) {
					System.out.print("[-] ");
				} else if (f1[ii][jj].beschossen) {
					System.out.print("[x] ");
				} else if (f1[ii][jj].beschossen && f1[ii][jj].besetzt) {
					System.out.print("[#] ");
				} else {
					System.out.print("[~] ");
				}
			}
			System.out.println(" ");
		}
	}
	
	void setzeSchiffe() {
		
		
		setzeSchiff(5);
		setzeSchiff(4);
//		System.out.println(setzeSchiff(5,isVertical));
	}
	
	Schiff setzeSchiff( int laengeSchiff) {
		boolean isVertical = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Möchten Sie Ihr Schiff horizontal(h) oder vertikal(v) platzieren?");
		while(true) {
			String eingabe = scanner.next();
			if (eingabe.equalsIgnoreCase("h")) {
				isVertical = false;
				break;
			} else if (eingabe.equalsIgnoreCase("v")) {
				break;
			} else {
				System.out.println("Die Eingabe war inkorrekt. Möchten Sie Ihr Schiff horizontal(h) oder vertikal(v) platzieren?");
			}
		}
		
		//Horizontal ermitteln
		int maxHorPosition;
		if (isVertical) {
			maxHorPosition = 10;			
		} else {
			maxHorPosition = this.f1[1].length - laengeSchiff + 1;
		}
		Scanner scanner2 = new Scanner (System.in);
		System.out.println("Die Länge des Schiffs ist: " + laengeSchiff);
		int eingabeHorInt;
		while (true) {
			System.out.println("Bitte nennen Sie die gewünschte Position( 1 - " + maxHorPosition + " ) des Schiffes in horizontaler Richtung!");
			String eingabeHor = scanner2.next();
			eingabeHorInt = Integer.parseInt(eingabeHor);
			if ( eingabeHorInt > (maxHorPosition) ) {
				System.out.println("Du kannst das Schiff so nicht platzieren, es würde über das Spielfeld hinausragen.");
			} else {
				break;
			}
		}
		//Vertikal ermitteln
		int maxVerPosition;
		if (!isVertical) {
			maxVerPosition = 10;			
		} else {
			maxVerPosition = this.f1[1].length - laengeSchiff + 1;
		}
		int eingabeVerInt;
		while (true) {
			System.out.println("Bitte nennen Sie die gewünschte Position( 1 - " + maxVerPosition + " ) des Schiffes in vertikaler Richtung!");
			String eingabeVer = scanner2.next();
			eingabeVerInt = Integer.parseInt(eingabeVer);
			if ( eingabeVerInt > (maxVerPosition) ) {
				System.out.println("Du kannst das Schiff so nicht platzieren, es würde über das Spielfeld hinausragen.");
			} else {
				break;
			}
		}
		scanner2.close();
		return(new Schiff(this, laengeSchiff, eingabeVerInt, eingabeHorInt, isVertical));
	}
	
	
	
	
}

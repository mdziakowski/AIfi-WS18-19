package uebung9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Rezeption {
	
	Queue<Mensch> warteschlange = new LinkedList<>();
	Set<Mensch> datei = new TreeSet<>();
	
	public void addWarteschlange(Mensch mensch) {
		if (!warteschlange.contains(mensch)) {
			warteschlange.add(mensch);
		}
		datei.add(mensch);
	}
	
	public void wurdeBehandelt(Doktor behandelnderArzt) {
		Mensch mensch = warteschlange.poll();
		mensch.setBehandelnderArzt(behandelnderArzt);
		behandelnderArzt.patientBehandelt();
		datei.add(behandelnderArzt);
	}

	public void remove(Mensch mensch) {
		datei.remove(mensch);
		warteschlange.remove(mensch);
	}
	
	public void gehälter() {
		for (Mensch mensch : datei) {
			if (mensch instanceof Mitarbeiter) {
				((Mitarbeiter) mensch).gehaltZahlen();
				System.out.println(((Mitarbeiter) mensch).gezahltesGehalt() + " Cent");
			}
		}
	}
	
	public void falscherDorktor(Mensch mensch) {
		Queue<Mensch> tmpwarteschlange = new LinkedList<>();
		tmpwarteschlange.add(mensch);
		tmpwarteschlange.addAll(warteschlange);
		warteschlange = tmpwarteschlange;
	}
	
	public static void main(String[] args) {
		
		Rezeption rezeption = new Rezeption();
		
		rezeption.addWarteschlange(new Patient("Olaf", 19561130, 1000));
		rezeption.addWarteschlange(new Patient("Hagen", 19850605, 666));
		rezeption.addWarteschlange(new Patient("Hagen", 19850605, 666));
		rezeption.wurdeBehandelt(new Doktor("Hans", 19680323));
		rezeption.falscherDorktor(new Patient("Olaf", 19561130, 1000));
		rezeption.remove(new Patient("Hagen", 19850605, 666));
		
		for (Mensch mensch : rezeption.warteschlange) {
			System.out.println(mensch.toString());
		}
		
		System.out.println("---------------------");
		
		for (Mensch mensch : rezeption.datei) {
			System.out.println(mensch.toString());
		}
		
		System.out.println("---------------------");
		
		rezeption.gehälter();
		
	}
	
}

package ha4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Galaxy {

	public static void main(String[] args) {
		
		mainList();
//		mainMap();
		
	}

	static void mainList() {
		List<GalaxyElement> galaxyList = new ArrayList<>();
		Sun sonne = new Sun("Sonne");
		Planet erde = new Planet("Erde", sonne, 10, 5);
		SpaceShip enterprise = new SpaceShip("Enterprise");
		galaxyList.add(sonne);
		galaxyList.add(erde);
		galaxyList.add(enterprise);
		
		Collections.sort(galaxyList, new NameComparator());
		Collections.sort(galaxyList);
		
		for (GalaxyElement g : galaxyList) {
			System.out.println(g.toString());
//			dynamic binding
		}
		
		System.out.println();
		
		for (int x = 0; x < 15; x++) {
			for (Iterator<GalaxyElement> i = galaxyList.iterator(); i.hasNext();) {
				GalaxyElement j = i.next();
				if (j instanceof Movable) {
					Movable moving = (Movable) j;
					moving.move();
					// dynamic binding
					System.out.println(j.toString());
					if (j instanceof Destroyable) {
						Destroyable destroying = (Destroyable) j;
						destroying.hit(25 * Math.random());
						if (destroying.isDestroyed()) {
							i.remove();
							System.out.println(j.getName() + " was destroyed!");
						}
					}
					System.out.println();
				}
			}
		}
	}
	
	static void mainMap() {
//		Treemaps werden nach Namen sortiert, während Hashmaps unsortiert sind.
//		Das liegt daran, dass Treemaps das Interface SortedMap implementieren.
		Map<String, GalaxyElement> galaxyList = new TreeMap<>();
		Sun sonne = new Sun("Sonne");
		Planet erde = new Planet("Erde", sonne, 10, 5);
		SpaceShip enterprise = new SpaceShip("Enterprise");
		galaxyList.put("Sonne", sonne);
		galaxyList.put("Erde", erde);
		galaxyList.put("Enterprise", enterprise);
		
		for (GalaxyElement g : galaxyList.values()) {
			System.out.println(g.toString());
//			dynamic binding
		}
		
		System.out.println();
		
		for (int x = 0; x < 15; x++) {
			for (Iterator<GalaxyElement> i = galaxyList.values().iterator(); i.hasNext();) {
				GalaxyElement j = i.next();
				if (j instanceof Movable) {
					Movable moving = (Movable) j;
					moving.move();
//					dynamic binding
					System.out.println(j.toString());
					if (j instanceof Destroyable) {
						Destroyable destroying = (Destroyable) j;
						destroying.hit(25 * Math.random());
						if (destroying.isDestroyed()) {
							i.remove();
							System.out.println(j.getName() + " was destroyed!");
						}
					}
					System.out.println();
				}
			}
		}
	}
	
}

package aufgabenblatt4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Galaxy {
	
	public static void main(String[] args) {
		
	
		
		GalaxyElement test = new GalaxyElement("Test");
		System.out.println(test);
	   
		Sun testSonne = new Sun("TestSonne", 5, 5, 78);
		
		Planet testPlanet = new Planet("testPlanet", testSonne);
				
		testPlanet.setDistance(3);
		testPlanet.setSize(45);
		
		SpaceShip testShip = new SpaceShip("testShip");
		
		Sun testSonne2 = new Sun("TestSonne2", 5, 5, 78);
		
		Planet testPlanet2 = new Planet("testPlanet2", testSonne);
				
		testPlanet2.setDistance(3);
		testPlanet2.setSize(45);
		
		SpaceShip testShip2 = new SpaceShip("testShip2");
		
		methodListe(testSonne, testPlanet, testShip);
		methodMap(testSonne2, testPlanet2, testShip2);
	}
	
	static void methodMap(Sun testSonne, Planet testPlanet, SpaceShip testShip) {
		System.out.println("Map-Methode");
		
		Map<String, GalaxyElement> map = new HashMap<>();
		map.put("Sonne", testSonne);
		map.put("Planet", testPlanet);
		map.put("SpaceShip", testShip);
		
		for (int i = 0; i <= 6; i++) {
			
			Iterator<Map.Entry<String, GalaxyElement>> iter = map.entrySet().iterator();
			
			while (iter.hasNext()) {
				
				Map.Entry<String, GalaxyElement> entry = iter.next();
				
				if (entry.getValue() instanceof Movable) {
					((Movable) entry.getValue()).move();
				}
				
				if (entry.getValue() instanceof Destroyable) {
					((Destroyable)entry.getValue()).hit(Math.random() * 25);
					
					if (((Destroyable) entry.getValue()).isDestroyed()) {
						iter.remove();
					}
				}				
				System.out.println(entry.getValue());
			}
		}
	}

	static void methodListe(Sun testSonne, Planet testPlanet, SpaceShip testShip) {
		System.out.println("Liste-Methode");
		
		List<GalaxyElement> list = new ArrayList<>();
		list.add(testSonne);
		list.add(testPlanet);
		list.add(testShip);

		
		for (int ii = 0; ii <= 6; ii++) {
			
			Iterator<GalaxyElement> i = list.iterator();
			while (i.hasNext()) {
				GalaxyElement e = i.next();
				
				if (e instanceof Movable) {
					((Movable) e).move();
				}
				
				if (e instanceof Destroyable) {
					((Destroyable) e).hit(Math.random() * 25);
					
					if (((Destroyable) e).isDestroyed()) {
						i.remove();
					}
				}
				System.out.println(e);
			}
		}
	}
}

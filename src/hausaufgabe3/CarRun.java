package hausaufgabe3;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;

public class CarRun {
	public static void main(String[] args){
        
		//Autos und Staus in GridWorld (Hausaufgabe 3)
		
		/**
		 * die Klasse ActorWorld hat noch einen zweiten Konstruktor,
		 * mit diesem kann direkt ein Grid übergeben werden
		 */
		ActorWorld world = new ActorWorld();
        BoundedGrid grid = new BoundedGrid<>(10, 30);
        world.setGrid(grid);
        
        // Setzen der Produktionsfabriken für Autos in der kompletten ersten Spalte
        
        /**
         * gute Verwendung der Schleife zum setzten der CarSource
         * beim anpassen des grids muss aber auch deine Schleife angepasst werden,
         * ohne wäre schöner
         */
        for(int i=0; i<10;i++) {
			world.add(new Location(i,0), new CarSource(0.6));
        }
        
        /**
         * gut das kein CarSource überschrieben wird
         */ 
        //Zufällig mehrere Steine in die Welt legen
        	for (int i=1;i<10;i++) {
        		for (int j=1; j<30; j++) {
        			if(Math.random()<0.015) {
        				world.add(new Location(i,j), new Rock());
        			}
        		}
        	}

        world.show();
	}
	
	/**
	 * funktioniert einwandfrei, ordentlicher Code und ganz gute Kommentierung
	 */
	
		
	//Basis-Welt (eine Autobahn)
	
//		ActorWorld world = new ActorWorld();
//      BoundedGrid grid = new BoundedGrid<>(1, 30);
//      world.setGrid(grid);  
//      world.add(new Location(0, 0), new Car(5));
//      world.show();
        
		
	//Probieren (Aufgabe 1.5)
	
//		ActorWorld world = new ActorWorld(); 
//		BoundedGrid grid = new BoundedGrid<>(10,50);
//		world.setGrid(grid);
//		
//		double probability = 0.1;
//		for(int i=0; i<10; i++) {
//				if(Math.random() < probability) {
//					world.add(new Location(i,0), new Car(1));
//				}
//			probability = probability + 0.1;
//		}
//		world.show();

}
/* 
 * Das Programm hat noch ein paar Fehler, Ich wusste nicht, wie man Objekte in einer
 * for-Schleife erzeugen kann, sodass man über eine Variable den Anzahl der Zeilen
 * angibt und über die for-Schleife dann genau so viele CarSource-Actors erzeugt.
 * 
 * Auch gibt es noch keine Funktion, damit Autos vor Hindernissen abbremsen.
 */

package ha3;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;

public class Run {

	public static void main(String[] args) {

		int rowCar = 0;
		int colCar = 0;

		float range = (float) 0.05;
		float cons = (float) 0.25;

		float prob1 = (float) ((range * 1) + cons);
		float prob2 = (float) ((range * 2) + cons);
		float prob3 = (float) ((range * 3) + cons);
		float prob4 = (float) ((range * 4) + cons);
		float prob5 = (float) ((range * 5) + cons);
		float prob6 = (float) ((range * 6) + cons);
		float prob7 = (float) ((range * 7) + cons);
		float prob8 = (float) ((range * 8) + cons);
		float prob9 = (float) ((range * 9) + cons);
		float prob10 = (float) ((range * 10) + cons);

		Location locCar = new Location(rowCar, colCar);

		Location locSource1 = new Location(0, 0);
		Location locSource2 = new Location(1, 0);
		Location locSource3 = new Location(2, 0);
		Location locSource4 = new Location(3, 0);
		Location locSource5 = new Location(4, 0);
		Location locSource6 = new Location(5, 0);
		Location locSource7 = new Location(6, 0);
		Location locSource8 = new Location(7, 0);
		Location locSource9 = new Location(8, 0);
		Location locSource10 = new Location(9, 0);

		ActorWorld world = new ActorWorld();

		world.setGrid(new BoundedGrid(10, 35));

		Car car1 = new Car(rowCar);

		car1.setDirection(90);

		world.add(locCar, car1);

		CarSource source1 = new CarSource(prob1, 0);
		CarSource source2 = new CarSource(prob2, 1);
		CarSource source3 = new CarSource(prob3, 2);
		CarSource source4 = new CarSource(prob4, 3);
		CarSource source5 = new CarSource(prob5, 4);
		CarSource source6 = new CarSource(prob6, 5);
		CarSource source7 = new CarSource(prob7, 6);
		CarSource source8 = new CarSource(prob8, 7);
		CarSource source9 = new CarSource(prob9, 8);
		CarSource source10 = new CarSource(prob10, 9);

		source1.setDirection(90);
		source2.setDirection(90);
		source3.setDirection(90);
		source4.setDirection(90);
		source5.setDirection(90);
		source6.setDirection(90);
		source7.setDirection(90);
		source8.setDirection(90);
		source9.setDirection(90);
		source10.setDirection(90);

		world.add(locSource1, source1);
		world.add(locSource2, source2);
		world.add(locSource3, source3);
		world.add(locSource4, source4);
		world.add(locSource5, source5);
		world.add(locSource6, source6);
		world.add(locSource7, source7);
		world.add(locSource8, source8);
		world.add(locSource9, source9);
		world.add(locSource10, source10);

		world.show();

	}

}

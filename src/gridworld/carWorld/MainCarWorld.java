package gridworld.carWorld;

import com.sun.prism.paint.Color;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;
import gridworld.framework.world.*;

public class MainCarWorld {
	
	public static void main (String args []) {
		
		BoundedGrid grid1 = new BoundedGrid(8,35);
		ActorWorld world1 = new ActorWorld (grid1);
		Car car1 = new Car();
		Location loc1 = new Location(0,0);
		car1.putSelfInGrid(grid1, loc1);
		Rock rock1 = new Rock();
		Location loc2 = new Location(0,4);
		rock1.putSelfInGrid(grid1, loc2);
		
		Car car2 = new Car();
		Location loc3 = new Location(1,0);
		car2.putSelfInGrid(grid1, loc3);
		
		Car car3 = new Car();
		Location loc4 = new Location(2,0);
		car3.putSelfInGrid(grid1, loc4);
		
		Car car4 = new Car();
		Location loc5 = new Location(3,0);
		car4.putSelfInGrid(grid1, loc5);
		
		Car car5 = new Car();
		Location loc6 = new Location(4,0);
		car5.putSelfInGrid(grid1, loc6);
		
		Car car6 = new Car();
		Location loc7 = new Location(5,0);
		car6.putSelfInGrid(grid1, loc7);
		
		
		CarSource cs1 = new CarSource();
		Location loc8 = new Location(6,0);
		cs1.putSelfInGrid(grid1, loc8);
		
		
		world1.show();
		
	}

}




//Fragen:

// Wieso gibt es eine Klasse World und eine Klasse Actorworld?

// Wieso dreht sich mein Auto-GIF?
// Wieso wird das Bild des Auto komisch angezeigt? (nicht das GIF, dass ich erstellt hatte)
// Soll das Auto den Stein irgendwann wegmachen?

// Wieso bewegt sich mein Auto aus der CarSource nicht?

// Was bedeuten die Warnungen: The expression of type BoundedGrid needs unchecked conversion to conform to Grid<Actor>
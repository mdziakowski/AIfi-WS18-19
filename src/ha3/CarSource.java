package ha3;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class CarSource extends Actor {
	public void act() {
		if (Math.random() < 0.1) {
			Grid<Actor> gr = getGrid();
			Location loc = getLocation();
			// guter Weg um die Nachberposition zu bestimmen
			Location next = loc.getAdjacentLocation(90);
        	Actor neighbor = gr.get(next);
        	if (neighbor == null) {
        		Car car = new Car((int) (Math.random() * 5));
        		car.putSelfInGrid(gr, next);
        	}
		}
	}

}

package gridworld.carWorld;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class CarSource extends Actor{
	int test=0;
	
	@Override
	public void act() {
		Grid<Actor> gr = getGrid();
		Location nextCarLoc = getLocation().getAdjacentLocation(90);
		Car newCar = new Car();
		newCar.putSelfInGrid(gr, nextCarLoc);
		System.out.println(newCar.getLocation());
		
	}

}

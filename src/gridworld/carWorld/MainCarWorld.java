package gridworld.carWorld;

import com.sun.prism.paint.Color;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;
import gridworld.framework.world.*;

public class MainCarWorld {
	
	public static void main (String args []) {
		
		BoundedGrid grid1 = new BoundedGrid(1,10);
		ActorWorld world1 = new ActorWorld (grid1);
		Car car1 = new Car();
		Location loc1 = new Location(0,0);
		car1.putSelfInGrid(grid1, loc1);
		
		world1.show();
		
	}

}

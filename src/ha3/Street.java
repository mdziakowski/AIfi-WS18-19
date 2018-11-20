package ha3;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;

public class Street {

	public static void main(String[] args) {
		BoundedGrid<Actor> gr = new BoundedGrid<Actor>(10,50);
		ActorWorld world = new ActorWorld(gr);

		for (int i = 0; i <= 9; ++i) {
			world.add(new Rock());
			
//			1.5
//			if (Math.random() < 0.1 * (i+1)) {
//				world.add(new Location(i,0), new Car((int) (Math.random() * 5)));
//			}
//			
//			1.6
			world.add(new Location(i,0), new CarSource());
		}
		world.show();
	}

}

package uebung10;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;

class Meer {

	public static void main(String[] args) {
		BoundedGrid<Actor> gr = new BoundedGrid<Actor>(10,21);
		ActorWorld world = new ActorWorld(gr);
		world.add(new Ship());
		world.add(new Marker());
		world.add(new Location(0,10), new GameMaster());
		world.show();
		
	}

}

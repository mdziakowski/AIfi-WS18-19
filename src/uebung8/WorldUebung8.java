package uebung8;

import java.awt.Color;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Critter;
import gridworld.framework.actor.Flower;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.Location;
import gridworld.myWorld.BabyBug;

public class WorldUebung8 {

	public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(4, 4), new Predator());
        world.add(new Location(5, 5), new BabyBug(Color.yellow));
        world.add(new Location(9, 9), new BabyBug(Color.yellow));
        world.add(new Location(1, 1), new Bug(Color.yellow));
        world.show();
    }
	
	
}

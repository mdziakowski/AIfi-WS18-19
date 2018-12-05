package uebung8;

import java.awt.Color;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Critter;
import gridworld.framework.actor.Flower;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.Location;

public class WorldUebung8 {

	public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        //world.add(new Location(4, 4), new Predator());
        world.add(new Location(5, 5), new BabyBug());
        //world.add(new Location(9, 9), new BabyBug());
        world.add(new Location(0,1), new Flower());
        world.add(new Location(0,2), new Flower());
        world.add(new Location(0,3), new Flower());
        world.add(new Location(0,4), new Flower());
        world.add(new Location(4,6), new Flower(Color.red));
        world.add(new Location(5,6), new Flower(Color.blue));
        //world.add(new Location(1, 1), new Bug(Color.yellow));
        world.show();
    }
	
	
}

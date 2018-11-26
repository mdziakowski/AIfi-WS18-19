package Aufgabe3;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class CarRun {
	
	public static void main(String[] args)
    {
		CarGrid gr = new CarGrid(10,50);
		
        ActorWorld world = new ActorWorld(gr);
        
        CarSource c0 = new CarSource(0.4); world.add(new Location (0,0), c0);
        CarSource c1 = new CarSource(0.4); world.add(new Location (1,0), c1);
        CarSource c2 = new CarSource(0.4); world.add(new Location (2,0), c2);
        CarSource c3 = new CarSource(0.4); world.add(new Location (3,0), c3);
        CarSource c4 = new CarSource(0.4); world.add(new Location (4,0), c4);
        CarSource c5 = new CarSource(0.4); world.add(new Location (5,0), c5);
        CarSource c6 = new CarSource(0.4); world.add(new Location (6,0), c6);
        CarSource c7 = new CarSource(0.4); world.add(new Location (7,0), c7);
        CarSource c8 = new CarSource(0.4); world.add(new Location (8,0), c8);
        CarSource c9 = new CarSource(0.4); world.add(new Location (9,0), c9);
       
        Rock rock1 = new Rock();
        
        world.add(rock1);
        
       
        
        world.show();
    }
	
	

}

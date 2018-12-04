package uebung8;

import java.util.ArrayList;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Critter;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.Location;
import gridworld.myWorld.BabyBug;

public class Predator extends Critter {
    
	
	
	@Override
	public void act()
    {
        if (getGrid() == null)
            return;
        ArrayList<Actor> actors = getActors();
        processActors(actors);
        ArrayList<Location> moveLocs = getMoveLocations();
        Location loc = selectMoveLocation(moveLocs);
        makeMove(loc);
    }
	
	
	@Override
	 public void processActors(ArrayList<Actor> actors)
	    {
	        for (Actor a : actors)
	        {
	            if ((a instanceof BabyBug))
	                a.removeSelfFromGrid();
	            break;
	        }
	    }




}





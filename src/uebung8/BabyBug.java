package uebung8;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Critter;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;
import gridworld.myWorld.Breeder;
import gridworld.myWorld.DBug;

public class BabyBug extends Critter {
	int eatenFlowers = 0;
	
	public BabyBug (){		
	}
	
//	 @Override
     public void act()     {
        	super.act();
        	countEatenFlowers();
     }

	public void countEatenFlowers() {
		if (eatenFlowers >= 3) {
			Location location = getLocation();
			Grid grid = getGrid();
			removeSelfFromGrid();
			if (Math.random() <= 0.5) {
				Breeder breeder = new Breeder ();
				breeder.putSelfInGrid(grid, location);
			} else {
				DBug bug = new DBug (Color.blue);
				bug.putSelfInGrid(grid, location);
								
			}
		}
	}

	@Override
	public void processActors(ArrayList<Actor> actors) {
		List<Flower> availableFlowers = new ArrayList<Flower>();
		
		System.out.println(actors.size());
		
		for (Actor actor: actors) {
			if (actor instanceof Flower) {
				availableFlowers.add((Flower) actor);
			}
		}
		
		if (!availableFlowers.isEmpty()) {
			Collections.sort(availableFlowers, new FlowerComparator());
			availableFlowers.get(0).removeSelfFromGrid();
			eatenFlowers++;
		}
		
	}
	 
	 public void move()
	    {
	        Grid<Actor> gr = getGrid();
	        if (gr == null)
	            return;
	        Location loc = getLocation();
	        Location next = loc.getAdjacentLocation(getDirection());
	        countEatenFlowers();
	        if (gr.isValid(next))
	            moveTo(next);
	        else
	            turn();
	    }
	 
	 
	 public void turn()
	    {
	        setDirection(getDirection() + Location.HALF_RIGHT);
	    }
}

package uebung8;

import java.awt.Color;

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
       	 countEatenFlowers();
        	 move();
        	 growUp();
        	 turn();
     }

	public void countEatenFlowers() {
		Grid<Actor> gr = getGrid();
		if (gr != null) {
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Actor neighbor = gr.get(next);
		if (neighbor instanceof Flower) {
			this.eatenFlowers++;
		}
     	}
	}

	public void growUp() {
		if (eatenFlowers == 3) {
			Grid<Actor> gr = getGrid();
			if (gr != null) {
			Location loc = getLocation();
			Location next = loc.getAdjacentLocation(getDirection());
			DBug dbugnew = new DBug(Color.black);
			this.removeSelfFromGrid();
			Breeder breeder = new Breeder();
			breeder.putSelfInGrid(gr, loc);
			}
		}
		
	}
	 
	 public void move()
	    {
	        Grid<Actor> gr = getGrid();
	        if (gr == null)
	            return;
	        Location loc = getLocation();
	        Location next = loc.getAdjacentLocation(getDirection());
	        if (gr.isValid(next))
	            moveTo(next);
	        else
	            removeSelfFromGrid();
	    }
	 
	 
	 public void turn()
	    {
	        setDirection(getDirection() + Location.HALF_RIGHT);
	    }
}

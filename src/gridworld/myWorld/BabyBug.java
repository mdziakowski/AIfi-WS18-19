package gridworld.myWorld;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;



public class BabyBug extends DBug {
	int eatenFlowers = 0;
	
	public BabyBug (Color bbugColor){
		super(bbugColor);
	}
	
	public BabyBug(){
		this(Color.yellow);
	}
	
	 @Override
     public void act()
     {
         if (canMove()) {
        	 countEatenFlowers();
        	 move();
        	 growUp();
         	}
         else
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
	 
	 @Override
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
	
	
//	public void removeFlower(){
//		
//	}
}

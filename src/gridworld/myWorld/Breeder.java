package gridworld.myWorld;


import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;
import gridworld.myWorld.*;

public class Breeder extends DBug{
	
	public Breeder(){
		super(Color.red);
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
	        Flower flower = new Flower(getColor());
	        if (Math.random() <0.75 ){
	        flower.putSelfInGrid(gr, loc);
	        } else {
	        BabyBug bb1 = new BabyBug (Color.yellow);
	   		bb1.putSelfInGrid(gr, loc);
	        }
	    }
	

}

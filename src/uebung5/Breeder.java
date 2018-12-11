package uebung5;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Breeder extends Bug{
	public Breeder() {}
	
	
	
	
	
	
	@Override
	public void move() {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        if (Math.random() > 0.15) {
        	Flower flower = new Flower(getColor());
        	flower.putSelfInGrid(gr, loc);
        }
        else {
        	BBug puenktchen = new BBug(Color.YELLOW);
        	puenktchen.putSelfInGrid(gr, loc);
        }
	}
}

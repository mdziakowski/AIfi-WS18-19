package uebung5;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;
import uebung5.gridworld.DisposableBug;

public class BBug extends Bug {
	int zahler = 0;
	
	BBug(Color colorbug) {
		setColor(colorbug);
	}
	
	@Override
	public void move() {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Actor neighbor = gr.get(next);
        if (neighbor instanceof Flower) {
        	zahler++;
        	System.out.println(zahler);
        }
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
        
        if (zahler >= 3) {
        	if (Math.random() >= 0.5) {
        		this.removeSelfFromGrid();
        		DisposableBug peter = new DisposableBug();
        		peter.putSelfInGrid(gr, loc);
        	}
        	else {
        		this.removeSelfFromGrid();
        		Breeder toni = new Breeder();
        		toni.putSelfInGrid(gr, loc);
        	}
        }
        
	}
}

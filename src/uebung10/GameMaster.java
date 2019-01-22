package uebung10;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class GameMaster extends Actor {
	
	GameMaster() {
		setColor(Color.CYAN);
	}
	
	public void act() {
		if (isShipExtinct()) {
			Ship.isP1 = !Ship.isP1;
		}
	}
	
	boolean isShipExtinct() {
		Grid<Actor> gr = getGrid();
		for (int x = 0; x < gr.getNumRows(); x++) {
			for (int y = 0; y < gr.getNumCols(); y++) {
				Location loc = new Location(x,y);
				if(gr.get(loc) instanceof Ship) {
					return false;
				}		
			}
		}
		return true;
	}

}

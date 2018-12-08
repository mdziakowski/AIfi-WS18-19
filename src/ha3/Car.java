package ha3;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor {
	int speed;
	
	Car (int speed) {
		this.speed = speed;
		setColor(Color.RED);
		setDirection(180);
	}
	
    public void move() {
    	if (speed < 5) {
    		speed++;
    	}
    	if (Math.random() < 0.2) {
    		speed--;
    	}
        Grid<Actor> gr = getGrid();
        Location loc = getLocation();
        int row = loc.getRow();
        int col = loc.getCol();
    	for (int i = 1; i <= speed; ++i) {
    		Location next = new Location (row, col + i);
            if (gr.isValid(next)) {
            	Actor neighbor = gr.get(next);
            	if (neighbor instanceof Rock || neighbor instanceof Car) {
            		speed = i - 1;
            		break;
            	}
            }
    	}
        Location next = new Location (row, col + speed);       
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
    
    public void act() {
    	move();
    }

}

// du machst die canMove()-Abfrage, bei dir auch in der move()-Methode, eine Trennung wäre schöner gewesen
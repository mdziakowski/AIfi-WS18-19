package gridworld.carWorld;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor {
	int speed = 3;
	
	@Override
	public void act() {
		setDirection(90);
		for (int i = speed;i>0 ; i--) {
			if (!checkRock()) {
			move();	
			}
		}
		accelerate();
		dawdle();
		
	}
	
	public boolean checkRock() {
		Grid<Actor> gr = getGrid();
        if (gr == null) return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        Actor neighbor = gr.get(next);
		if (neighbor instanceof Rock) {
			this.speed=0;
			return true;
		} else return false;
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
	
	public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next)) {
        	removeSelfFromGrid();
            return false;}
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Rock);
    }
	
	public void accelerate() {
		if (speed<5) {
			speed++;
		}
	}
	
	public void dawdle() {
		if ((Math.random()<=0.2) && (speed>0)) {
			speed--;
		}
	}

}

package aufgabenblatt3_GridWorld;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;



class Car extends Actor{
	int speed ;
	double prob_slow;
	
	
	Car(int speed, double prob_slow){ // Generator 1 
		this.speed = speed ;
		this.prob_slow = prob_slow ;
		setDirection(90) ;
	}
	
	Car(int speed) { // Generator 2
		this(speed, 0.2) ;
	}
	
	@Override
	public void act() {
		for (int i = 1; i <= speed; i++) 
			if (canMove())
				move();
			else if (isEdge())
				removeSelfFromGrid();
			else {
				speed = 0 ;
				break ;
			}
		accelerate() ;
		deccelerate() ;
	}
	
    public void move() // Adapted from Bug.java
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
       // Flower flower = new Flower(getColor());
       // flower.putSelfInGrid(gr, loc);
    }
	
    
    public boolean canMove() // Adapted from Bug.java
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);

    }
    
    public boolean isEdge() // Adapted from Bug.java
    {       
    	Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
    	Location loc = getLocation();
    	Location next = loc.getAdjacentLocation(getDirection());
		return !gr.isValid(next) ;
    }
    
    public void accelerate() {
    	if (speed < 5)
    		speed++ ;
    }
    
    public void deccelerate() {
    	if (Math.random() <= prob_slow)
    		speed-- ;
    }
}


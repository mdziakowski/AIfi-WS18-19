package aufgabenblatt3_GridWorld;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class CarSource extends Actor {
	double prob_spit;
	int speed ;
	
	public CarSource(int speed, double prob_spit) { // Generator 1
		this.speed = speed ; 
		this.prob_spit = prob_spit ;
	}
	
	public CarSource(int speed) { // Generator 2
		this(speed, 0.5) ;
	}
	
	public CarSource(double prob_spit) { // Generator 3
		this(2, prob_spit) ;
	}
	
	public CarSource() { // Generator 4
		this(2, 0.5) ;
	}
	
	@Override
	public void act() {

		Location loc = getLocation() ;
		int row = loc.getRow() ;
		Grid<Actor> gr = getGrid();

	    if ((Math.random() <= prob_spit) && canSpit()) {
	    	Car car1 = new Car(speed, 0.1 * row) ;
	    	car1.putSelfInGrid(gr, new Location(row, 1));
	    }    	
	}
	
    public boolean canSpit() // Adapted from Bug.java
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(90);
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null) || (neighbor instanceof Flower);
    }
}

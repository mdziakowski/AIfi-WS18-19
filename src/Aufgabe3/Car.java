package Aufgabe3;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Flower;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;


//irgendwo ist hier noch ein Fehler, da ab und zu cars rocks überschreiben, habe den Fehler leider noch nicht gefunden

public class Car extends Bug{
	
	private double speed;
	
	
	public Car(double speed) {
		
		this.speed = speed;
	}
	
	 public void move()
	    {
		 
		 Grid<Actor> gr = getGrid();
		 if (gr == null)
		     return;
		 Actor act = gr.get(this.nextLocation());
		        if (gr.isValid(this.nextLocation()))
		            moveTo(this.nextLocation()); 
		        else 
		        	removeSelfFromGrid();
		 }
	    
	        
	 
	@Override
	public void act() {
		// TODO Auto-generated method stub
		this.realSpeed();
		// if (canMove() && !ifSlowDown()) {
		if (canMove() && ifSlowDown() == false) {
			 move();
			speedUp(); 
			}
		else if(canMove() && ifSlowDown() == true) {
			this.slowDown();
			move();
			speedUp();
		}
		else if (!canMove()){
			removeSelfFromGrid();
	}
	}

	public double getSpeed() {
			return speed;
		}
	public void setSpeed(double speed) {
			this.speed = speed;
		}

	public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null) {
            return false;}
        else if (!gr.isValid(this.nextLocation())) {
            return false;
            }
        else  {
        	return true;
        }
    }
	public boolean ifSlowDown() {
		Grid<Actor> gr = getGrid();
		double i=0;
		Location next = getLocation();
		for(i=0; i<this.getSpeed();i++) {
			 
		     next = next.getAdjacentLocation(90);
		     
		     Actor neighbor = gr.get(next);
		        if(neighbor instanceof Rock)
		        	break;    
		}
		
		if(i == this.speed) {
		return false;
		
		}
		else
		return true;
	
	}
	
	public Location nextLocation() {
		
		 Grid<Actor> gr = getGrid();
		 if (gr == null)
		     return null;
		 Location next = getLocation();
		 for(int i=1 ; i<=this.getSpeed() ; i++) {
			 next = next.getAdjacentLocation(90);
			 }
		 
		 if (Math.random()<0.2 && !(next.getRow() == 0)) {
			 
			 
			 	
			 		next = next.getAdjacentLocation(0);
			 
		 } else if (Math.random()>0.8 && !(next.getRow() == gr.getNumRows()-1)) {
			
			 	 
			 		next = next.getAdjacentLocation(180);
		 }
		 
		return next;
	}
	public void slowDown() {
		 Grid<Actor> gr = getGrid();
		 if (gr == null)
		     return;
		while(ifSlowDown()) {
		this.setSpeed(this.getSpeed()-1); }
	}
	
	public void speedUp() {
		if (this.getSpeed()<5) {
			this.setSpeed(this.getSpeed()+1);
		}
	}
	
	public void realSpeed() {
		if (Math.random()<0.2) {
			this.setSpeed(this.getSpeed()-1);
		} else {
			this.setSpeed(this.getSpeed());
		}
		
	}
			

	
	
}

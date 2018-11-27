package hausaufgabe3;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Flower;
import gridworld.framework.actor.Rock; 

public class Car extends Actor{
	
	// Attribute des Autos
	private int speed;
	
	//Konstruktoren 
	public Car() {
		super();
	}
	
	public Car(int speed) {
		super();
		this.speed = speed;
	}
	
	//Methode
	public void act() {
		
		Location position = getLocation();
		Grid<Actor> gr = getGrid();
		
		for(int i = 1; i <= speed; i++) {
			Location newLocation = new Location(position.getRow(), position.getCol() + i);
			if (gr.isValid(newLocation)) {
				Actor neighbor = gr.get(newLocation);
					if (neighbor instanceof Rock || neighbor instanceof Car) {
							speed = i-1;
							break;
					}
			}
		}
		
		Location newLocation = new Location(position.getRow(), position.getCol() + speed);
		if (this.getGrid().isValid(newLocation)) {
			moveTo(newLocation);
		} else {
			//System.out.println("new Location (row=" + newLocation.getRow() + " , col=" + newLocation.getCol() + ") is not valid! car will be removed!");
			removeSelfFromGrid();
		}
		
		//Trödeln oder Beschleunigen?
		if (Math.random()<0.4 && speed > 0) {	// (&& speed > 0), damit das Auto nicht rückwärts fährt
			speed = speed -1;
		}else if (speed<5) {
			speed = speed +1;
		}
	}
	

	
//	//Aufgabe 1.2 Bremsen (erster Versuch, unabhängig vom restlichen Programm)
	
//	public void act () {
//		
//		Grid<Actor> gr = getGrid();
//		if (gr == null)
//			return;
//		
//		Location position = getLocation();
//		//Location newLocation = new Location(position.getRow(), position.getCol() + speed);
//		
//		for(int i=1;i<speed;i++) {
//		Location newLocation = new Location(position.getRow(), position.getCol() + i);
//		Actor neighbor = gr.get(newLocation);
//		if (neighbor instanceof Rock) {
//			break;
//		
//		if (this.getGrid().isValid(newLocation)) {
//			moveTo(newLocation);
//			
//		} else
//			removeSelfFromGrid();
//		}
//	}
}
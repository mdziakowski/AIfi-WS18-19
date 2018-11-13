package gridworld.myWorld;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;



public class BabyBug extends DBug {
	
	BabyBug (Color bbugColor){
		super(bbugColor);
		
	}
	
	
	public void moveTo(){
		if (neighbor instanceof Flower){
			System.out.println("Flower");
		}
		super.moveTo();
	}
	
	// Location zu der gelaufen wird rauskriegen
	// eigene Methode erstellen die Flower Removed
	// Methode in act aufrufen
	
	

	

}

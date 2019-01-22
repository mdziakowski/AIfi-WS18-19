package uebung10;

import java.awt.Color;

import gridworld.framework.actor.Actor;

public class Marker extends Actor {
	
	public void act() {
		if (Ship.shipListP1.contains(getLocation())) {
			setColor(Color.RED);
		}
		else if (Ship.shipListP2.contains(getLocation())) {
			setColor(Color.GREEN);
		}
		else {
			setColor(Color.BLACK);
		}
	}

}

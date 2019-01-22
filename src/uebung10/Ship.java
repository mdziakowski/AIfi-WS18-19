package uebung10;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Location;

public class Ship extends Actor {
	
	static List<Location> shipListP1 = new ArrayList<>();
	static List<Location> shipListP2 = new ArrayList<>();
	
	static boolean isP1 = true;
	
	public Ship() {
		setColor(Color.BLACK);
	};
	
	public void act() {
		if (isP1) {
			shipListP1.add(getLocation());
		}
		else {
			shipListP2.add(getLocation());
		}
		removeSelfFromGrid();
	}
	
}

package uebung5;

import java.awt.Color;

import gridworld.framework.actor.Bug;

public class DBug extends Bug {
	
	int zyklus = 0;

	DBug(Color colorbug) {
		setColor(colorbug);
	}

	@Override
	public void act(){
		if (Math.random() <= 0.4) {
			super.turn(); 
		}
		super.act();
		if (zyklus >= 25 && Math.random() <= 0.8) {
			this.removeSelfFromGrid();
		}
		zyklus++;
	}

}

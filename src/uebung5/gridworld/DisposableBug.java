package uebung5.gridworld;

import java.awt.Color;

import gridworld.framework.actor.Bug;

public class DisposableBug extends Bug {
	
	private int zyklus = 0;
	
	public DisposableBug() {
		super(Color.BLUE);
	}

	@Override
	public void act(){
		if (Math.random() <= 0.4) {
			super.turn(); 
		}
		if (zyklus >= 25 && Math.random() <= 0.8) {
			this.removeSelfFromGrid();
		} else {
			super.act();
			zyklus++;
		}
	}

}

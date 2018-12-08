package uebung8;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Critter;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;
import uebung8.gridworld.Breeder;
import uebung8.gridworld.DisposableBug;

class BabyBug extends Critter {
	
	private int flowerEaten = 0;
	
	public BabyBug() {
		this.setColor(Color.YELLOW);
	}

	@Override
	public void act() {
		super.act();
		if (flowerEaten >= 3) {
			Location loc = getLocation();
			Grid gr = getGrid();
			removeSelfFromGrid();
			if (Math.random() <= 0.5 ) {
				Breeder breeder = new Breeder();
				breeder.putSelfInGrid(gr, loc);
			} else {
				DisposableBug disposableBug = new DisposableBug();
				disposableBug.putSelfInGrid(gr, loc);
			}	
		}
	}
	
	@Override
    public void processActors(ArrayList<Actor> actors) {
		
		List<Flower> flowers = new ArrayList<Flower>();
		
        for (Actor a : actors) {
            if (a instanceof Flower) {
                flowers.add((Flower) a);
            }
        }
        
        if (!flowers.isEmpty()) {
        	Collections.sort(flowers, new FlowerComperator());
        	flowers.get(0).removeSelfFromGrid();
        	flowerEaten++;
        }
    }

}

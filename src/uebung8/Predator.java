package uebung8;

import java.util.ArrayList;
import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Critter;

class Predator extends Critter {
	
	Predator(){}
	
	@Override
    public void processActors(ArrayList<Actor> actors)
    {
        for (Actor a : actors)
        {
            if (a instanceof BabyBug)
                a.removeSelfFromGrid();
        }
    }
	
	
}

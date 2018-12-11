package uebung5.gridworld;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Rock;

public class RunWorld {
	
	public static void main(String[] args) {
		
		ActorWorld world = new ActorWorld();
        world.add(new DisposableBug());
        world.add(new DisposableBug());
        world.add(new Breeder());
        world.add(new Breeder());
        world.add(new Rock());
        world.show();
		
	}

}

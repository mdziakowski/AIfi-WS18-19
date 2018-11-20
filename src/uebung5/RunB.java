package uebung5;

import gridworld.framework.actor.ActorWorld;

public class RunB {

	public static void main(String[] args) {
		 ActorWorld world = new ActorWorld();
		 Breeder anthon = new Breeder();
		 world.add(anthon);
		 world.show();
	}

}

package uebung8;

import gridworld.framework.actor.ActorWorld;
import uebung8.gridworld.Breeder;

class PredatorMain {

	public static void main(String[] args) {
		 ActorWorld world = new ActorWorld();
		 Predator predator = new Predator();
		 BabyBug babyBug = new BabyBug();
		 world.add(predator);
		 world.add(babyBug);
		 world.add(new Breeder());
		 world.show();
	}

}

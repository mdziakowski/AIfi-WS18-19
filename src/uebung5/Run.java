package uebung5;

import java.awt.Color;

import gridworld.framework.actor.ActorWorld;

public class Run {

	public static void main(String[] args) {
		 ActorWorld world = new ActorWorld();
		 Breeder breeder1 = new Breeder(Color.RED);
		 world.add(breeder1);
		 world.show();
	}
}

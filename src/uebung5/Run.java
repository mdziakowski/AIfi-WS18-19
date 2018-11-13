package uebung5;

import java.awt.Color;

import gridworld.framework.actor.ActorWorld;

public class Run {

	public static void main(String[] args) {
		 ActorWorld world = new ActorWorld();
		 DBug dBug = new DBug(Color.BLUE);
		 world.add(dBug);
		 world.show();
	}
}

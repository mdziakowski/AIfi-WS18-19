package uebung8;

import java.util.Comparator;

import gridworld.framework.actor.Flower;

public class FlowerComparator implements Comparator<Flower> {

	@Override
	public int compare(Flower o1, Flower o2) {
		int r1 = o1.getColor().getRed();
		int r2 = o2.getColor().getRed();
		if (r1 > r2) {
			return 1;
		} else if (r1 < r2) {
			return -1;
		} else {
			return 0;
		}
	}
	

}

package uebung8;

import java.util.Comparator;
import gridworld.framework.actor.Flower;

class FlowerComperator implements Comparator<Flower> {

	@Override
	public int compare(Flower f1, Flower f2) {
		
		int r1 = f1.getColor().getRed();
		int r2 = f2.getColor().getRed();
		
		if (r1 > r2) {
			return 1;
		}
		else if (r1 == r2 ) {
			return 0;
		}
		else {
			return -1;
		}
	}	

}

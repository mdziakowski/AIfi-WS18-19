package aufgabenblatt3_GridWorld;
import gridworld.framework.actor.* ;
import gridworld.framework.grid.* ;


class MyGridWorld {

	public static void main(String[] args) {
		
		// Set up Grid
		int num_row = 10; // Number of Lanes
		ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(num_row, 50)) ;
		
		
		for (int i = 0 ; i <num_row ; i++) {
			// *** Question 1.5 : ***
			// *** Inputs for Car: new Car(Initial Speed, Probability of Slowing down ***
			// *** Uncomment next line to run Exercise 1.5 ***
			//world.add(new Location(i,0), new Car(2, 0.1 * i));
			
			// *** Question 1.6 : Car Source ***
			// *** Inputs for Car Source: new CarSource(Initial Car Speed, Probability of Source Generating Car)
			// *** Probability of slowing down ranges from 0 to 0.9 in the 10 lanes ***
			// *** Uncomment next line to run Exercise 1.6 ***
			world.add(new Location(i,0), new CarSource(2, 0.5)); 
			
		}
		world.show();

		

	}

}

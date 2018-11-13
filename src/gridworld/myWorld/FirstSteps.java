package gridworld.myWorld;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Rock;

public class FirstSteps {
	
	public static void main (String args []){
		
		ActorWorld world1 = new ActorWorld ();
		 world1.add(new Bug());
	     world1.add(new Rock());
	     world1.show();
		
	}

}

package gridworld.myWorld;

import java.awt.Color;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Rock;

public class FirstSteps {
	
	public static void main (String args []){
		
		ActorWorld world1 = new ActorWorld ();
		 DBug dbug1 = new DBug (Color.BLUE);
		 world1.add(dbug1);
		 
		 Breeder breeder1 = new Breeder ();
		 world1.add(breeder1);
		
//		 world1.add(new DBug()); // wieso geht das? ohne dem DBug einen Namen zu geben?
	     world1.show();
		
	}

}

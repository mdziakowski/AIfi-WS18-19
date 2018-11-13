package uebung3;

public class Farmer {
	
	Farmer(){
		
	}
	
	void feedCow (Cow cowToFeed){
		if (cowToFeed.hungry == false){
			System.out.println("Die Kuh ist nicht hungrig!");
		}
		cowToFeed.hungry=false;
		
		
	}

}

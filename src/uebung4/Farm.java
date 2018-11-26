package uebung4;

public class Farm {

	public static void main(String[] args) {

		Cow cow1 = new Cow("Berta");
		Cow cow2 = new Cow("Hilde");
		Cow cow3 = new Cow("Miltank");

		System.out.println(cow1.getName());
		System.out.println(cow2.getName());
		System.out.println(cow3.getName());
		System.out.println("Anzahl der Cows: " + Cow.getCowCount());

		System.out.println(cow1.getName() + " Hunger: " + cow1.isHungry());
		Farmer farmer = new Farmer();
		farmer.feedCow(cow1);
		System.out.println(cow1.getName() + " Hunger: " + cow1.isHungry());
		
		Calf calf = cow1.giveBrith("Johnny");
		System.out.println(calf.getName());
		
	}

}
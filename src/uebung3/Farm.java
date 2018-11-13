package uebung3;

public class Farm {

	public static void main(String[] args) {
		Cow cow1 = new Cow ("Peter");
		Cow cow2 = new Cow ("Klaus");
		Cow cow3 = new Cow ("Marianne");
		Farmer farmer1 = new Farmer ();
		
		System.out.println(cow1.getName());
		System.out.println(cow2.getName());
		System.out.println(cow3.getName());
		
		System.out.println(Cow.cowCounter);
		
		System.out.println(cow1.hungry);
		cow1.toggle();
		System.out.println(cow1.hungry);
		farmer1.feedCow(cow1);
		System.out.println(cow1.hungry);
		
		Calf kalb1 = cow1.giveBirth("Jana");
		
		System.out.println(kalb1.getName());

	}

}

package uebung3;

public class Farm {

	public static void main(String[] args) {
		Cow cow1 = new Cow ("Peter");
		Cow cow2 = new Cow ("Klaus");
		Cow cow3 = new Cow ("Marianne");
		
		System.out.println(cow1.getName());
		System.out.println(cow2.getName());
		System.out.println(cow3.getName());
		
		System.out.println(Cow.cowCounter);

	}

}

package uebung6;

public class Main {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		//a.bark();
		if (a instanceof Dog) {
		((Dog) a).bark();
		}

		Animal b = new Animal();
		if (b instanceof Dog) {
		((Dog) b).bark();
		}
		
	}

}

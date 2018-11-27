package uebung6;

public class StaticVsDynamicBinding {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		callEat(a);
		callEat((Dog)a);
		a.eat();
		
	}
	
	public static void callEat(Animal animal) {
		System.out.println("Animal is eating");
	}
	
	public static void callEat(Dog dog) {
		System.out.println("Dog is eating");
	}
	
}

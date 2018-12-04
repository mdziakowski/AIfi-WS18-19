package uebung6;

public class Animal {
	
	public static void callEat(Animal animal) {
		System.out.println("Animal is eating");
	}
	
	public static void callEat(Dog dog) {
		System.out.println("Dog is eating");
	}
	
	void eat() {
		System.out.println("Animal eating");
	}
	
	public static void main(String[] args) {
		
		Animal a = new Dog();
		callEat(a);
		a.eat();	
		
	}
	
}

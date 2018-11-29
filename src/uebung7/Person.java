package uebung7;

class Person {
	
	String name;
	int age;
	boolean hungry = true;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name:" + name + " Age:" + age + " Hungry:" + hungry;
	}
	
	void bDay() {
		age++;
	}
	
	void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

}

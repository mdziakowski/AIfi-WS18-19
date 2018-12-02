package eigeneUebung7;

class Person {
	
	private String name;
	private int age;
	private boolean hungry;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void birthday() {
		age++;
	}
	
	void setHungry(boolean hungry) {
		this.hungry = hungry;
	}
	
	@Override
	public String toString() {
		return name + ", Alter: " + age + ", Hungry: " +hungry;
	}

}

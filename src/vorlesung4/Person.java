package vorlesung4;

class Person {
	int age;
	void setAge(int age) {
		this.age = age;
	}
	
	void ausgabeMethod () {
		System.out.println("Person Ausgabe");
	}

	public static void main(String[] args) {
		Adult p1 = new Adult();
		p1.setAge(12);
		System.out.println(p1.age);
		p1.setAgeinAdult(13);
		System.out.println(p1.age);

	}

}

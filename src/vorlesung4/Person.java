package vorlesung4;

class Person {
	int age;
	String name;
	int schuhgroesse;
	
	
	Person (int age, String name, int schuhe){
		this.age=age;
		this.name=name;
		schuhgroesse=schuhe;
	}
	
	Person(int age, int schuhe){
		this (age, "",schuhe);
	}
	
//	Person(){
//		
//	}

	public static void main(String[] args) {
		Person p1 = new Person(24,"Pascal",44);
		Person p2 = new Person(23,40);
		System.out.println(p2.name +  " Name");
		Adult p3 = new Adult(23,44);
		
		
	}
	
	
	
	void setAge(int age) {
		this.age = age;
	}
	
	void ausgabeMethod () {
		System.out.println("Person Ausgabe");
	}


}

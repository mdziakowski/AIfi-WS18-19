package implementationsuebungen;

public class Main {
	public static void main (String Args []) {
		
		// PersonImpl1
		PersonImpl1 pers1 = new PersonImpl1();
		pers1.setAge(12);
		System.out.println(pers1.getAge());
		
		//PersonImpl2
		PersonImpl2 pers2 = new PersonImpl2();
		pers2.setAge(12);
		System.out.println(pers2.getAge());
		
		//PersonImpl1 als Compiletimetype PersonI
		PersonI pers3 = new PersonImpl1();
		pers3.setAge(33);
		System.out.println(pers3.getAge());
		pers3.setAge(34);
		
		PersonImpl1 pers4 = new PersonImpl1();
		pers4.yell();
		
		PersonImpl1 pers5 = (PersonImpl1)pers3;
		System.out.println(pers5.getAge());
		
		pers3.setAge(44);
		System.out.println(pers5.getAge());
		pers5.yell();
		
		System.out.println(pers5 instanceof PersonI);
		
		
		
	}

}

package implementationsuebungen;

public class PersonImpl1 implements PersonI {

	private int age;
	
	@Override
	public void setAge(int tmp) {
		age=tmp;

	}

	@Override
	public int getAge() {
		return(age);	

	}
	
	public void yell() {
		System.out.println("YELL!");
	}

}

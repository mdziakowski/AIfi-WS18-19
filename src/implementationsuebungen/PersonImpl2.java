package implementationsuebungen;

public class PersonImpl2 implements PersonI {
	private double age;

	@Override
	public void setAge(int tmp) {
		age=(double)tmp;		
	}

	@Override
	public int getAge() {
		return (int)age;
	}
	
	

}

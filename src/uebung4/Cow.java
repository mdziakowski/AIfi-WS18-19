package uebung4;

public class Cow {
	
	private String cowname;
	private static int cowCounter = 0;
	public boolean hungry = true;

	public Cow (String name) {
		cowname = name;
		cowCounter++;
	}

	public String getName() {
		return this.cowname;
	}
	
	public static int getCowCount() {
		return cowCounter;
	}
	
	public void toogle(){
		
		this.hungry = !this.hungry;
	}

	public boolean isHungry() {
		return this.hungry;
	}


	

}


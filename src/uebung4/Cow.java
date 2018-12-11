package uebung4;

public class Cow {
	
	private String cowname;
	private static int cowCounter = 0;
	private boolean hungry = true;

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

	public boolean isHungry() {
		return this.hungry;
	}
	
	public void toogleHungry() {
		this.hungry = !this.hungry;
	}
	
	public Calf giveBirth(String name) {
		return new Calf(name, this);
	}

}

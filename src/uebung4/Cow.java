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

}

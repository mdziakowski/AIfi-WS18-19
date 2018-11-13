package uebung3;

public class Cow {
	
	private String name;
	static int cowCounter; // soll nicht bei jeder neuen Kuh neu hochzählen
	boolean hungry = false;
	
	Cow (String name){
		this.name=name;
		this.cowCounter++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public String getName(){
		return name;
	}
	
	public void toggle (){
		this.hungry = !this.hungry;
	}
	
	public Calf giveBirth(String name){
		Calf calf1 = new Calf(name, this);
		return calf1;
	}

}

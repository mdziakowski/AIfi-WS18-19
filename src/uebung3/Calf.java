package uebung3;

public class Calf extends Cow {
	Cow muttertier;
	
	Calf (String name, Cow muttertier){
		super(name);
		this.muttertier = muttertier;
		
	}
	
	@Override
	public String getName(){
		
		String kalbName=super.getName();
		String mutterName=muttertier.getName();
		
		return ("Mutter: " + mutterName + " Kalb: " + kalbName );
		
	}

}

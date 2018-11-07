package uebung4;

public class Calf extends Cow {

	private Cow parent;
	
	public Calf(String name, Cow parent) {
		super(name);
		this.parent = parent;
	}
	
	@Override
	public String getName() {
		return super.getName() + ": Mutter = " + parent.getName();
	}
	
}

package vorlesung10;

public class TestObjekt implements Comparable<TestObjekt> {
	private int a;
	private int b;
	private int c;
	private int id;
	
	TestObjekt (int id, int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		this.id = id;
	}

	@Override
	public int compareTo(TestObjekt o) {
		if ( this.getId() > o.getId() ) {
			return 1;
		} else if ( this.getId() == o.getId() ) {
			return 0;
		} else {
		return -1;
		}
	}
	
	
	

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return("ID: " + this.getId() + " A: " + this.getA() + " B: " + this.getB() + " C: " + this.getC());
	}

	
}

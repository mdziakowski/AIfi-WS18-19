package aufgabenblatt4;

class GalaxyElement {
	
	 protected double x;
	 protected double y;
	 protected int size;
	 protected String name;
	
	GalaxyElement(String name) { 
		this(name, 0, 0, 0);
	}
	
	GalaxyElement(String name, double x, double y, int size){
		this.name = name;
		this.x = x;
		this.y = y;
		this.size = size;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", x:" + x + ", y:" + y + ", size:" + size;
	}

}

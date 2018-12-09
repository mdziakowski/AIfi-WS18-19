package ha4;

class GalaxyElement implements Comparable<GalaxyElement>{
	
	double x = 0;
	double y = 0;
	double size = 100;
	String name;
	
	GalaxyElement(String name) {
		this.name = name;
	}
	
	GalaxyElement(double x, double y, double size, String name) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.name = name;
	}

	double getX() {
		return x;
	}

	double getY() {
		return y;
	}

	double getSize() {
		return size;
	}

	String getName() {
		return name;
	}
	
	public String toString() {
		return "X:" + x + "; Y:" + y + "; Size:" + size + "; Name:" + name;
	}

	@Override
	public int compareTo(GalaxyElement g) {
		if (this.size < g.size)
			return 1;
		else if (this.size == g.size)
			return 0;
		else
			return -1;
	}
	
	
}

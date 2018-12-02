package aufgabenblatt4;

final class Sun extends GalaxyElement {

	Sun(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	Sun(String name, double x, double y, int size) {
		super(name, x, y, size);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Sonne: " + name + ", x:" + x + ", y:" + y + ", size:" + size;

	}

}

package ha4;

public class Galaxy {

	public static void main(String[] args) {

		GalaxyElement element1 = new GalaxyElement(5, 8, 2, "Timo");

		System.out.println(element1.toString());

		Sun sonne1 = new Sun(10, 0, 2, "Peter");

		System.out.println(sonne1.toString());

		Planet planet1 = new Planet(5, 1, "Jürgen", sonne1);

		System.out.println(planet1.toString());

		// System.out.println(planet1.piAngel);

		System.out.println("X: " + planet1.x + " Y: " + planet1.y);

		// planet1.move();

		// System.out.println("X: " + planet1.x + " Y: " + planet1.y);

	}

}

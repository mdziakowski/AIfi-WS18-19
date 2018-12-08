package uebung8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeSortierer {
	
	public static void main(String[] args) {
			
		List<Shape2D> shapes = new ArrayList<>();
		shapes.add(new Shape2D(3.4, 2.0));
		shapes.add(new Shape2D(3.0, 2.5));
		for (Shape2D s : shapes) {
			System.out.println("Unsortiert: " + s);
		}
		Collections.sort(shapes);
		for (Shape2D s : shapes) {
			System.out.println("Sortiert nach circumference: "  + s);
		}
		Collections.sort(shapes, new ShapeAreaComparator());
		for (Shape2D s : shapes) {
			System.out.println("Sortiert nach circumference: " + s);
		}
	}

}

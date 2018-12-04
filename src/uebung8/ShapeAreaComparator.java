package uebung8;

import java.util.Comparator;

public class ShapeAreaComparator implements Comparator<Shape2D> {
		@Override
		public int compare(Shape2D o1, Shape2D o2) {
			Double area1 = o1.getArea();
			Double area2 = o2.getArea();
			return area1.compareTo(area2);
		}


}

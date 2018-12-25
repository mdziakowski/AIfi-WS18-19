package vorlesung10;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ComparatorTest {

	public static void main(String[] args) {
			List<TestObjekt> obList = new ArrayList<>();
			
			System.out.println("\ngenerate TestObjekt with random id/a,b,c...");
			for ( int ii = 0 ; ii<10 ; ii++) {
				TestObjekt ag = new TestObjekt( (int) ii, (int) (100000.*Math.random()) , (int) (100000.*Math.random()) , (int) (100000.*Math.random()));
			obList.add(ag);
			}
			for ( int ii = 0 ; ii<10 ; ii++) {
				TestObjekt ag = new TestObjekt( (int) ii, (int) (100000.*Math.random()) , (int) (100000.*Math.random()) , (int) (100000.*Math.random()));
			obList.add(ag);
			}
			
			System.out.println("\ndemonstrate that id/age are in rnd sequence");
			for ( TestObjekt k : obList) {
				System.out.println("ID: " + k.getId() + " A: " + k.getA() + " B: " + k.getB() + " C: " + k.getC());
			}
			
			System.out.println("\nsort the Objekts according to comperator");
			Comparator<TestObjekt> cmp = new MyTestComparator();
			Collections.sort(obList, cmp);
			
			System.out.println("\nprint out TestObjekts");
			for (TestObjekt k : obList) {
				System.out.println(k.toString());
			}

	}

}

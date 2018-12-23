package vorlesung10;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CompareMain {

	public static void main(String[] args) {
		TestObjekt t1 = new TestObjekt (1,1,1,65);
		TestObjekt t2 = new TestObjekt (2,4,5,1);
		TestObjekt t3 = new TestObjekt (3,3,6,5);
		
		SortedSet<TestObjekt> list1 = new TreeSet<>();
		list1.add(t1);
		list1.add(t2);
		list1.add(t3);
		
		for (TestObjekt t : list1) {
			System.out.println("ID: " + t.getId() + " A: " + t.getA() + " B: " + t.getB() + " C: " + t.getC());
		}

	}

}

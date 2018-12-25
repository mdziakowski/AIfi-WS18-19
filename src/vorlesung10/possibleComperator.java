package vorlesung10;

import java.util.Comparator;

public class possibleComperator implements Comparator<TestObjekt>{

	@Override
	public int compare(TestObjekt o1, TestObjekt o2) {

		int compareID = o1.compareTo(o2);
		
		if (compareID != 0) {
			return compareID;
		}
		
		Integer o1A = o1.getA();
		Integer o2A = o2.getA();
		int compareA = o1A.compareTo(o2A);
		if (compareA != 0) {
			return compareA;
		}
		
		Integer o1B = o1.getB();
		Integer o2B = o2.getB();
		int compareB = o1B.compareTo(o2B);
		if (compareB != 0) {
			return compareB;
		}
		
		Integer o1C = o1.getC();
		Integer o2C = o2.getC();
		return o1C.compareTo(o2C);

		}
	}
	

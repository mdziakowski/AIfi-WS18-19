package vorlesung10;

import java.util.Comparator;

public final class MyTestComparator implements Comparator<TestObjekt> {

	@Override
	public int compare(TestObjekt arg0, TestObjekt arg1) {
		
		//ID
		int compareID = arg0.compareTo(arg1);
		//A
		int compareA;
		if ( arg0.getA() > arg1.getA() ) {
			compareA = 1;
		} else if ( arg0.getA() == arg1.getA() ) {
			compareA = 0;			
		} else {
			compareA = -1;
		}
		//B
		int compareB;
		if ( arg0.getB() > arg1.getB() ) {
			compareB = 1;
		} else if ( arg0.getB() == arg1.getB() ) {
			compareB = 0;			
		} else {
			compareB = -1;
		}
		//C
		int compareC;
		if ( arg0.getC() > arg1.getC() ) {
			compareC = 1;
		} else if ( arg0.getC() == arg1.getC() ) {
			compareC = 0;			
		} else {
			compareC = -1;
		}
		
		/// Final Comp.
		
		if (compareID == 1) {
			return 1;
		} else if (compareID == -1) {
			return -1;
		} else if (compareA == 1 ){
			return 1;
		} else if (compareA == -1) {
			return -1;
		} else if (compareB == 1) {
			return 1;
		} else if (compareB == -1) {
			return -1;
		} else if (compareC == 1) {
			return 1;
		} else if (compareC == -1) {
			return -1;
		} else {
			return 0;
		}	
	}
}

package aufgabenblatt4_Vererbung;

import java.util.Comparator;

class MyComparator implements Comparator<GalaxyElement>{

	@Override
	public int compare(GalaxyElement o1, GalaxyElement o2) {
		
		// First Size
		int sizeComp = o1.compareTo(o2) ;
		if (sizeComp != 0)
			return sizeComp ;
		
		// Then Name 
		String n1 = o1.getName() ;
		String n2 = o2.getName() ;
		return n1.compareTo(n2) ;
		
		
		
	}

}

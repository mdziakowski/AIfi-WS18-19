package ha4;

import java.util.Comparator;

class NameComparator implements Comparator<GalaxyElement> {

	@Override
	public int compare(GalaxyElement g1, GalaxyElement g2) {
		String name1 = g1.getName();
		String name2 = g2.getName();
		return name1.compareTo(name2);
	}
		
}

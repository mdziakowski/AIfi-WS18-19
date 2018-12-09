package hausaufgaben.aufgabenblatt4;

import java.util.Comparator;
import hausaufgaben.aufgabenblatt4.GalaxyElement;

public class GEComparator implements Comparator<GalaxyElement> {

	@Override
	public int compare(GalaxyElement e1, GalaxyElement e2) {
		//int SizeCompare = e1.getSize().compareToSize(e2.getSize()); ----> Wie kann ich hier die Größe vergleichen? Klappt leider nicht
		int SizeCompare = 1;
		int NameCompare = e1.getName().compareTo(e2.getName());
		
		
		if (NameCompare == 0) {
			return ((SizeCompare == 0) ? NameCompare : SizeCompare);
		} else {
			return (NameCompare);
		}
		
	}
	

}

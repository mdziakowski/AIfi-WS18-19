/* The 2. main() function is in GalaxyHash. That is where HashMap and TreeMap are tested.
 * 
 * Dynamic Binding is used for the move() functions, because Planets and Spaceships have different
 * move() functionalities. 
 */

package aufgabenblatt4_Vererbung;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


final class Galaxy {

	public static void main(String[] args) {	
		// Create Galaxy Elements
		GalaxyElement gal = new GalaxyElement("Beet", 9, 9, 10000.00) ;
		Sun ss = new Sun("Carrot", 10, 5, 100.00) ;
		Planet pl = new Planet("Spinach", ss, 5, 1) ;
		SpaceShip sp = new SpaceShip("Voyager") ;
		Sun ss1 = new Sun("Apple", 10, 5, 100.00) ;
		Sun ss2 = new Sun("Broccoli", 10, 5, 100.00) ;
		Sun ss3 = new Sun("Cauliflower", 10, 5, 100.00) ;
		
		// Add ELements to ArrayList 
		List<GalaxyElement> elements = new ArrayList<>() ; // ArrayList to contain the Galaxy Elements
		elements.add(gal) ;
		elements.add(ss) ;
		elements.add(pl) ;
		elements.add(sp) ;	
		elements.add(ss3) ;
		elements.add(ss1) ;
		elements.add(ss2) ;
		
		// Sort Elements: first Size, second Name 
		printAllElements(elements) ;
		Collections.sort(elements, new MyComparator());
		System.out.println("\n***Sorted*** (weight --> name");
		printAllElements(elements) ;	
		
		// Move Elements, Remove Spaceships if Power < 0
		int NumberActions = 3 ; // Number of Times all Elements are moved
		for (int i = 1 ; i <= NumberActions ; i++) {
			System.out.print("\n\n****Action " + i + " ****\n");
			act(elements);
			printAllElements(elements) ;
		}		
	}
	
	
	
	private static void act(List<GalaxyElement> elements) {
		for (Iterator<GalaxyElement> it = elements.iterator() ; it.hasNext() ; ) {
			GalaxyElement element = it.next() ;
			if (element instanceof Movable) 
				((Movable) element).move() ;
			
			if (element instanceof Destroyable) {
				int rnd = new Random().nextInt(26) ;
				((Destroyable) element).hit(rnd) ;
				if (((Destroyable) element).isDestroyed()) {
					System.out.println(element.name + " has been destroyed :( \n");
					
					it.remove();		
				}	
			}
		}
	}
	
	
	private static void printAllElements(List<GalaxyElement> elements) {
		for ( GalaxyElement el : elements ) {
			System.out.println(el);
			}
		}
	}



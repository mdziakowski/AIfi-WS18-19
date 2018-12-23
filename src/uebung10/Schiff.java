package uebung10;

class Schiff {
	World motherworld;
	int size;
	boolean isVertical;
	int vertical;
	int horizontal;
	
	Schiff ( World motherworld, int size, int vertical, int horizontal, boolean isVertical ) {
		this.motherworld = motherworld;
		this.size = size;
		this.isVertical = isVertical;
		this.vertical = vertical;
		this.horizontal = horizontal;
//		motherworld.f1;
	}
	
	
	
	
	
	///////////////////////Methoden
	
	public String toString() {
		return("Schiff; Position: (" + horizontal + "," + vertical + "), Größe: " + size + ", isVertical: " + isVertical);
	}

}


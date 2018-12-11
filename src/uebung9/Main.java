package uebung9;

class Main {
	
	public static void main (String args []){
		Patient p1 = new Patient("Tom Maier", 12, 10, 1987, 12124);
		Patient p2 = new Patient("Peter Pan", 8,3,1943, 1234555);
		Patient p3 = new Patient("Aaron Hunt", 2,3,1990, 88993);
		Patient p4 = new Patient("Jason Siegel", 10, 10, 1995, 1285);
		Patient p5 = new Patient ("Luna Eifried", 12,12,1988, 87904);
		
		Rezeption r1 = new Rezeption();
		r1.warteSchlange.add(p1);
		r1.warteSchlange.add(p2);
		r1.warteSchlange.add(p3);
		r1.warteSchlange.add(p4);
		r1.warteSchlange.add(p5);
		
		
		
		
	}

}

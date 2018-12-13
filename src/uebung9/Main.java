package uebung9;

class Main {
	
	public static void main (String args []){
		Patient p1 = new Patient("Tom Maier", 12101987, 12124);
		Patient p2 = new Patient("Peter Pan", 8031943, 1234555);
		Patient p3 = new Patient("Aaron Hunt", 2031990, 88993);
		Patient p4 = new Patient("Jason Siegel", 10101995, 1285);
		Patient p5 = new Patient ("Luna Eifried", 12121988, 87904);
		
		Doktor a1 = new Doktor("Dr. Meier",10102018);
		
		Rezeption r1 = new Rezeption();
		r1.aufnahmePatient(p1);
		r1.aufnahmePatient(p2);
		r1.aufnahmePatient(p3);
		r1.aufnahmePatient(p4);
		r1.aufnahmePatient(p5);
		
		//		r1.warteSchlange.add(p1);
//		r1.warteSchlange.add(p2);
//		r1.warteSchlange.add(p3);
//		r1.warteSchlange.add(p4);
//		r1.warteSchlange.add(p5)
		
//		r1.patientZuArzt(p1, , doc);
		System.out.println("vor Arztbesuchen");
		warteSchlangeAusgeben(r1);
		System.out.println(" ");
		karteiAusgeben(r1);
		r1.patientZuArzt(p1, a1);

		
		System.out.println("\nnach Arztbesuchen");
		warteSchlangeAusgeben(r1);
		System.out.println(" ");
		karteiAusgeben(r1);
		
		
	}

	public static void warteSchlangeAusgeben(Rezeption r1) {
		for (Patient p : r1.warteSchlange) {
			System.out.print(p.getName() + " ");
			System.out.println(p.getVersicherungsnummer());
		}
	}
	
	public static void karteiAusgeben(Rezeption r1) {
		for (Patient p : r1.datei) {
			System.out.print(p.getName() + " ");
			System.out.println(p.getVersicherungsnummer());
		}
	}

}

package uebung9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

class Rezeption {
	Queue<Patient> warteSchlange = new LinkedList<>();
	Set<Patient> datei = new TreeSet<>();
	
	
	void aufnahmePatient (Patient aktPat){
		warteSchlange.offer(aktPat);
		if (!this.datei.contains(aktPat)){
			this.datei.add(aktPat);
		}
		
	}
	
	void patientZuArzt (Patient aktPat, Doktor doc){
		warteSchlange.remove(aktPat);
		doc.zahleGehalt();
		
	}
	
	
	

}

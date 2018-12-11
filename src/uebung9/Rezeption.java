package uebung9;

import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedList;

class Rezeption {
	
	Queue<Patient> warteSchlange = new LinkedList<>();
	Set<Patient> datei = new TreeSet<>();
	
	void addPatient(Patient patient) {
		warteSchlange.offer(patient);
	}
	
	void nextPatient(Doktor doc) {
		warteSchlange.poll();
		doc.zahleGehalt();
	}
	
	void readdPatient(Patient patient) {
		Queue<Patient> alteWarteSchlange = new LinkedList<>();
		alteWarteSchlange.addAll(warteSchlange);
		warteSchlange = new LinkedList<>();
		warteSchlange.offer(patient);
		warteSchlange.addAll(alteWarteSchlange);
	}
}

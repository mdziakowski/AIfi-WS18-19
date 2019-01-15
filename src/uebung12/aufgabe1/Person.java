package uebung12.aufgabe1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dgrether
 */
public class Person {

	private String id;
	private String name;
	private List<String> vornamen;
	private int alter;
	
	public Person(String id){
		this.id = id;
		this.vornamen = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getVornamen() {
		return vornamen;
	}
	public void addVorname(String vorname) {
		this.vornamen.add(vorname);
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public String getId() {
		return id;
	}
	
}


package uebung9;

public class Mensch implements Comparable<Mensch> {
	
	private String name;
	private int geburtsdatum;
	private Doktor behandelnderArzt;
	
	public Mensch(String name, int geburtsdatum) {
		this.name = name;
		this.geburtsdatum = geburtsdatum;
	}

	public String toString(){
		return name + ", " + geburtsdatum;
	}

	public String getName() {
		return name;
	}

	public int getGeburtsdatum() {
		return geburtsdatum;
	}
	
	public void setBehandelnderArzt(Doktor behandelnderArzt) {
		this.behandelnderArzt = behandelnderArzt;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.getGeburtsdatum() == ((Mensch) obj).getGeburtsdatum() && this.getName().equals(((Mensch) obj).getName())) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Mensch o) {
		if (this.getGeburtsdatum() > o.getGeburtsdatum()) {
			return 1;
		} else if (this.getGeburtsdatum() == o.getGeburtsdatum() && this.getName().equals(o.getName())) {
			return 0;
		} else {
			return -1;
		}
		
	}
}

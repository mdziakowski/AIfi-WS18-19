package uebung9;


class Mensch implements Comparable<String> {
	
	String name;
	String bDay;
	
	Mensch(String name, String bDay) {
		this.name = name;
		this.bDay = bDay;
	}

	@Override
	public int compareTo(String name) {
		if (this.name.charAt(0) > name.charAt(0)) {
			return 1;
		}
		else if (this.name == name) {
			return 0;
		}
		else {
			return -1;
		}
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getbDay() {
		return bDay;
	}

	void setbDay(String bDay) {
		this.bDay = bDay;
	}

}

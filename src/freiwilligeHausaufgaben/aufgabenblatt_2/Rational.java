package freiwilligeHausaufgaben.aufgabenblatt_2;

public class Rational {
	
	private int zaehler;
	private int nenner;
	
	public Rational() {
		setZaehler(0);
		setNenner(1);
	}

	public Rational(int zaehler, int nenner) {
		setZaehler(zaehler);
		setNenner(nenner);
	}	

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
	
	public String printRational() {
		if(zaehler<0 && nenner<0) {
			this.zaehler = -zaehler;
			this.nenner = -nenner;		
		}
		return Integer.toString(zaehler) + "/" + Integer.toString(nenner);
	}
	
	public void negate() {
		this.zaehler = -zaehler;
		if(this.zaehler<0 && this.nenner<0) {
			this.zaehler = -this.zaehler;
			this.nenner = -this.nenner;		
		}
	}
	
	public void invert() {
		int zahlerNew = nenner;
		this.nenner = zaehler;
		this.zaehler = zahlerNew;
	}
	
	public double toDouble() {
		return (double) zaehler / (double) nenner;
	}
	
	public void reduce() {
		int zahl1 = zaehler;
		int zahl2 = nenner;
		
		while (zahl2 != 0) {
			if (zahl1 > zahl2) {
			    zahl1 = zahl1 - zahl2;
			} 
			else {
				zahl2 = zahl2 - zahl1;
			}
		}
		
		int ggT = zahl1;
		System.out.println("Der groesste gemeinsame Teiler von Zaehler und Nenner ist: " + ggT);

		if (ggT == 1) {
			System.out.println("Dementsprechend konnte der Bruch nicht weiter gekuerzt werden!");
		}
		else {
			this.zaehler = zaehler/ggT;
			this.nenner = nenner/ggT;
			System.out.println("Der gekuerzte Bruch lautet dementsprechend: " + this.zaehler + "/" + this.nenner);
		}

	}
	
	public Rational add(Rational z) {
		this.zaehler = zaehler*z.getNenner() + z.getZaehler()*nenner;
		this.nenner = nenner * z.getNenner();
		return new Rational(this.zaehler, this.nenner);
	}


}

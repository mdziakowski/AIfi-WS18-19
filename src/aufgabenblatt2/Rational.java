package aufgabenblatt2;

class Rational {
	
	 int zähler;
	 int nenner;
	
	Rational(){
		zähler = 0;
		nenner = 1;
	}
	
	Rational(int zähler,  int nenner) {
		this.zähler = zähler;
		this.nenner = nenner;
	}
	
	void printRational() {
		System.out.println(this.zähler + "/" + this.nenner);
	}
	
	void setZähler(int zähler) {
		this.zähler = zähler;
	}
	
	void setNenner(int nenner) {
		this.nenner = nenner;
	}
	
	void negate() {
		this.zähler *= (-1);
	}
	
	void invert () {
		int help = this.zähler;
		this.zähler = this.nenner;
		this.nenner = help;
	}
	
	void toDouble() {
		double komma = (double) this.zähler / this.nenner;
		System.out.println(komma);
	}
	
	Rational reduce() {
		int nennerNeu;
		int zählerNeu;
		
		if (nenner == zähler) {
			nennerNeu = 1;
			zählerNeu = 1;
		}
			nennerNeu = nenner / ggT(nenner, zähler);
			zählerNeu = zähler / ggT(nenner, zähler);
			
		
		Rational ret = new Rational(zählerNeu, nennerNeu);
		return ret;				
	}
	
	void add(Rational add) {
		if (this.nenner == add.nenner) {
			this.zähler += add.zähler;
			
		} else {
			this.nenner *= add.nenner;
			this.zähler += (this.zähler * add.nenner + this.nenner * add.zähler);
		}
	}
	
	private static int ggT(int a, int b) {
		if (a > b) {
			
			int merke = b;
			for (int ii = b; ii > 0; ii--) {
				
				if (a % ii == 0 && merke % ii ==0) {
					b = ii;
					break;
				}
			}
			return b;
			
		} else if (b > a) {
			
			for (int ii = a; ii > 0; ii--) {
				
				int merke = a;
				if (b % ii == 0 &&  merke % ii == 0) {
					a = ii;
					break;
				}
			}
			return a;
		}
		return 1;
	}
}

package aufgabenblatt2;

class ImmutableRational {

	private int zähler;
	private int nenner;
	
	ImmutableRational(){
		zähler = 0;
		nenner = 1;
	}
	
	ImmutableRational(int zähler,  int nenner) {
		this.zähler = zähler;
		this.nenner = nenner;
	}
	
	void printRational() {
		System.out.println(this.zähler + "/" + this.nenner);
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
	
	void reduce() {
		
		if (nenner == zähler) {
			nenner = 1;
			zähler = 1;
		} else {
			nenner = nenner / ggT(nenner, zähler);
			zähler = zähler / ggT(nenner, zähler);
		}
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

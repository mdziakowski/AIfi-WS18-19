package aufgabenblatt2_EigeneObjekte;

public class Rational {
	private int z; // Declare instance variables (attributes)
	private int n;
	
	public Rational () { // constructor 1 
		z = 0 ;
		n = 1 ;
	}
	
	public Rational (int z, int n) { // constructor 2
		this.z = z ;
		this.n= n ;	
	}
	
	public void printRational() {
		System.out.println(z + "/" + n) ;
	}
	
	public void setZ(int z) {
		this.z = z ;
	}
	
	public void setN(int n) {
		this.n = n ;
	}
	
	public void negate() {
		this.z = -1 * z ; 
	}
	
	public void invert() {
		int hold = z ;
		z = n ;
		n = hold ;
	}
	
	public double toDouble() {
		double d = (double) z / (double) n;
		return d ;
	}
	
	public void reduce() {
		int gcd = GCD(z , n) ;
		z = z/gcd ;
		n = n/gcd ;
		
	}
	
	public void add(Rational frac) {
		int A1 = z ;
		int B1 = n ;
		int A2 = frac.z ;
		int B2 = frac.n ;
		n = B1 * B2 ;
		z = B1 * A2 + B2 * A1 ;
		this.reduce() ;
	}
	
	public int GCD(int A, int B) {
		while (A != 0 && B != 0) {
			int remainder = A % B ;
			A = B ;
			B = remainder ; 
			}
		return A ;
		}
	
}






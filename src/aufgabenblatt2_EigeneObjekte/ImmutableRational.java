package aufgabenblatt2_EigeneObjekte;

public class ImmutableRational {
	private int z; 
	private int n;
	
	public ImmutableRational () { // constructor 1 
		z = 0 ;
		n = 1 ;
	}
	
	public ImmutableRational (int z, int n) { // constructor 2
		this.z = z ;
		this.n= n ;	
	}
	
	public void printImmutableRational() {
		System.out.println(z + "/" + n) ;
	}
	
	public ImmutableRational negate() {
		int z_n = -1 * z ;
		ImmutableRational rat_new = new ImmutableRational(z_n, n);
		return rat_new ; 
	}
	
	public ImmutableRational invert() {
		int z_n = n ;
		int n_n = z ;
		ImmutableRational rat_new = new ImmutableRational(z_n, n_n);
		return rat_new ; 
	}
	
	public double toDouble() {
		double d = (double) z / (double) n;
		return d ;
	}
	
	public ImmutableRational reduce() {
		int gcd = GCD(z , n) ;
		z = z/gcd ;
		n = n/gcd ;
		ImmutableRational rat_reduce = new ImmutableRational(z , n);
		return rat_reduce ;
	}
	
	public ImmutableRational add(ImmutableRational frac) {
		int A1 = z ;
		int B1 = n ;
		int A2 = frac.z ;
		int B2 = frac.n ;
		int denom = B1 * B2 ;
		int numer = B1 * A2 + B2 * A1 ;
		ImmutableRational rat_new = new ImmutableRational(numer, denom) ;
		ImmutableRational rat_simp = rat_new.reduce() ;
		return rat_simp ; 
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

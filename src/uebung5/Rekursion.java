package uebung5;

public class Rekursion {
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		
	}

	private static long factorial(int n) {
		
		if(n == 0) {
			return 1;
		} else {
			return factorial(n-1) * n;
		}
		
	}
	
}

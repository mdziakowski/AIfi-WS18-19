package aufgabenblatt1_Basics;

public class Aufgabenblatt1 {
	
	public static void main(String[] args) {
		
		double a = 16;
		double xi = a/2;
		double xialt = 0;
		int i = 1;
		
		do {
			xialt = xi;
			System.out.println("Approximation Nr." + i + ": " + xi);
			xi = formel(a, xi);
			i++;
		} while( xialt - xi > 0.0001); 
	}
	
	public static double formel(double a, double xo) {
		 return (xo + a/xo)/2;
	}

}

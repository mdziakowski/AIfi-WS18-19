package aufgabenblatt1_Basics;

public class SquareRoot {
	public static void main(String[] args) {
		double a = 0.5; // Enter value here
		double x0 = a/2;
		double x1 ;
		double delta = 1;
		
		while (delta >= 0.0001) {
			x1 = (x0 + a/x0)/2 ;
			delta = Math.abs(x1-x0) ; 
			System.out.println("x1= " + x1) ;
			x0 = x1 ;
			}
	}
}
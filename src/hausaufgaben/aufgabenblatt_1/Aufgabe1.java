package hausaufgaben.aufgabenblatt_1;

public class Aufgabe1 {
	public static void main(String[] args) {
		
		double a = 50;
		double x0 = a/2;
		double x1 = a;
		double sqrt_a;
		
		sqrt_a = mySqrt(a, x0, x1);
		
		System.out.println("Die Wurzel von a = " + a + " ist ungefähr " + sqrt_a);
		System.out.println("Test mit java Methode Math.sqrt(a) = " + Math.sqrt(a));

	}

	private static double mySqrt(double a, double x0, double x1) {
		do{ 
			if (x1 != a) {
				x0 = x1;
			}	
				
			x1 = (x0 + a/x0)/2; 
			
            System.out.println(x1);
           
        }while(Math.abs(x1-x0) > 0.0001); 
		
		return x1;
	
	}
	
}

package hausaufgaben;

public class Aufgabe1 {
	public static void main(String[] args) {
		
		double a = 277;
		double x0 = a/2;
		double x1 = a;
		int i = 1; 
		
		do{ 
			if (i > 1) {
				x0 = x1;
			}
            x1 = (x0 + a/x0)/2; 
            System.out.println(x1);
            i++;
           
        }while(Math.abs(x1-x0) > 0.0001); 
		
		System.out.println("Die Wurzel von a = " + a + " ist ungefähr " + x1);
		System.out.println("Test mit java Methode Math.sqrt(a) = " + Math.sqrt(a));

	}

}

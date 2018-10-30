package hausaufgaben;

public class Aufgabe1 {
	public static void main(String[] args) {
		
		double a = 16;
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
		
		System.out.println("Die Wurzel von a = " + a + " ist " + x1);

	}

}

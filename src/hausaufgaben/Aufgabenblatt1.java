package hausaufgaben;

public class Aufgabenblatt1 {
	
public static void main(String[] args) {
	double a = 9;
	double x0 = a/2;
	double x1 = (x0+a/x0)/2;
	
	while((x0 - x1) > 0.000001) {
		x0 = x1;
	    x1 = (x0+a/x0)/2;
		System.out.println(x1);
	};                                                                                
}

}

package Hausaufgaben;

public class WurzelBrechnen {
	public static void main (String[] args) {
		double a = 36;
		double xn = 0;
		for (double x=a/2;;x=xn) {
			xn=(x+a/x)/2;
			System.out.println(xn);
			if ((xn-x)<=0.0001 && (xn-x)>=(-0.0001)){
				System.out.println();
				System.out.print(xn+" ist Wurzel von "+a);
				break;
		}
		
		// funktioniert einwandfrei, gute verwendung von break
		// bitte auf die Formatierung achten (Tastenkombination strg + shift + f, hilft oft), gibt in der HA auch Punkte dafür
				
	}
}
}
package aufgabenblatt2_EigeneObjekte;

public class Main {

	public static void main(String[] args) {
		// Task 5 - Constructor 
		System.out.println("Constructor 1:");
		Rational rat = new Rational() ;
		rat.setZ(1) ;
		rat.setN(3) ; 
		rat.printRational();

		
		// Task 6 - Constructor 2 
		System.out.println("\nConstructor 2:");
		Rational rat2 = new Rational(5, 10) ;
		rat2.printRational();
		
		// Task 7 - Negate 

		System.out.println("\nNegate:");
		Rational rat3 = new Rational(5, 10) ;
		rat3.printRational();
		rat3.negate() ;	
		rat3.printRational();
		
		// Task 8 - Invert
		System.out.println("\nInvert:");
		Rational rat4 = new Rational(5, 10) ;
		rat4.printRational();
		rat4.invert() ;
		rat4.printRational();
		
		// Task 9 - toDouble
		System.out.println("\nDouble:");
		Rational rat5 = new Rational(5, 10) ;
		rat5.printRational();
		double rat_doub = rat5.toDouble() ; 
		System.out.print(rat_doub);
		
		// Task 10 - Reduce
		System.out.println("\n\nReduce");
		Rational rat6 = new Rational(256, 1024) ;
		rat6.printRational();
		rat6.reduce();
		rat6.printRational();
		
		// Task 11 - Add
		System.out.println("\nAdd:");
		Rational rat7 = new Rational(30, 90) ;
		rat7.printRational();
		System.out.println("+");
		Rational rat8 = new Rational(7, 49) ;
		rat8.printRational();
		System.out.println("=");
		rat7.add(rat8);
		rat7.printRational();
		
		// PART 2 - IMMUTABLE
		//Negate
		System.out.println("\n\nPART 2 \nNegate:");		
		ImmutableRational imrat = new ImmutableRational(6,12) ;
		ImmutableRational imrat_new = imrat.negate() ;
		imrat.printImmutableRational(); // original object remains unchanged
		imrat_new.printImmutableRational(); // new object is negated
		
		//Invert
		System.out.println("\nInvert:");		
		ImmutableRational imrat2 = new ImmutableRational(6,12) ;
		ImmutableRational imrat_new2 = imrat2.invert() ;
		imrat2.printImmutableRational(); 
		imrat_new2.printImmutableRational();
		

	}

}

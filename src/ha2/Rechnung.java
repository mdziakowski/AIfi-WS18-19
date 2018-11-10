package ha2;

class Rechnung {

	public static void main(String[] args) {
		Rational rational1 = new Rational();
		rational1.setRational(2,6);
		rational1.printRational();
		
		Rational rational2 = new Rational(5,7);
		rational2.printRational();
		
		rational2.negate();
		rational2.printRational();
		
		rational2.invert();
		rational2.printRational();
		
		double number = rational2.toDouble();
		System.out.println(number);
		
		rational1.reduce();
		rational1.printRational();
		
		rational1.add(2, 5);
		rational1.printRational();
		
		
		ImmutableRational iRational1 = new ImmutableRational(4,8);
		iRational1.printRational();
		
		int negated[] = new int[2];
		negated = iRational1.negate();
		System.out.println(negated[0] + "/" + negated[1]);
		
		int inverted[] = new int[2];
		inverted = iRational1.invert();
		System.out.println(inverted[0] + "/" + inverted[1]);
		
		int reduced[] = new int[2];
		reduced = iRational1.reduce();
		System.out.println(reduced[0] + "/" + reduced[1]);
		
		int added[] = new int[2];
		added = iRational1.add(1,4);
		System.out.println(added[0] + "/" + added[1]);
	}
	
}

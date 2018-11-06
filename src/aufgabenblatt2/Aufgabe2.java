package aufgabenblatt2;

class Aufgabe2 {

	public static void main(String[] args) {
		Rational rat = new Rational();
		
		rat.printRational();
		
		rat.setZähler(9);
		rat.setNenner(27);		
		
		rat.printRational();
		
		rat.negate();
		rat.printRational();
		rat.negate();
		rat.printRational();
		
	//	rat.invert();
		rat.printRational();
		rat.toDouble();
		
		Rational ret = rat.reduce();
		ret.printRational();
		rat.printRational();
		
		ImmutableRational immu = new ImmutableRational(6,8);
		immu.reduce();
		immu.printRational();
	}
}

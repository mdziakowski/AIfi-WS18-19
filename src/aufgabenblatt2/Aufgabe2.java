package aufgabenblatt2;

class Aufgabe2 {

	public static void main(String[] args) {
		Rational rat = new Rational();
		
		rat.printRational();
		
		rat.setZähler(32);
		rat.setNenner(4);		
		
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
		
		ImmutableRational immu = new ImmutableRational(8,8);
		immu.printRational();
		immu.reduce();
		immu.printRational();
	}
}

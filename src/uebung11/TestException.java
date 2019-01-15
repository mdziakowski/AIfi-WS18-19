package uebung11;

public class TestException {

	static int dividieren(double a, double b) throws EigeneCheckedException {
		int c = (int) (a / b);
		double d = a / b;
		if (c != d) {
			throw new EigeneCheckedException();
		}
		return c;
	}

	static int dividieren1(double a, double b) {
		int c = (int) (a / b);
		double d = a / b;
		try {
			if (c != d) {
				throw new EigeneCheckedException("Keine Ganzzahl");
			}
		} catch (EigeneCheckedException e) {
			e.printStackTrace();
		}
		return c;
	}

	static int dividieren2(double a, double b) throws EigeneUncheckedException {
		int c = (int) (a / b);
		double d = a / b;
		if (c != d) {
			throw new EigeneUncheckedException("Keine Ganzzahl");
		}
		return c;
	}

	public static void main(String[] args) {

		try {
			System.out.println(dividieren(9, 5));
		} catch (EigeneCheckedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Wird immer ausgeführt");
		}
		System.out.println(dividieren1(9, 5));
		System.out.println(dividieren2(9, 5));
	}

}

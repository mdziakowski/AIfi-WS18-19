package uebung9;

class Taschenrechner {
	
	double result;
	
	void reset() {
		result = 0;
	}
	
	double getResult() {
		return result;
	}
	
	void add(double x) {
		result += x;
	}
	
	void substract(double x) {
		result -= x;
	}
	
	void multiply(double x) {
		result *= x;
	}
	
	void divide(double x) {
		result /= x;
	}
}

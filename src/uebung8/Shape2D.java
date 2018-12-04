package uebung8;

public class Shape2D implements Comparable<Shape2D>{
	
	private double circumference;
	private double area;
	
	public Shape2D( double circumference, double area) {
		this.circumference = circumference;
		this.area = area;
	}

	public double getCircumference() {
		return circumference;
	}

	public double getArea() {
		return area;
	}
	
	public String toString() {
		return "My area size is " + this.area + ". My circumference is " + this.circumference + ".";
	}

	public int compareTo( Shape2D andereForm) {
		if (this.circumference > andereForm.circumference) {
			return 1;
		} else if (this.circumference == andereForm.circumference) {
			return 0;
		} else {
			return -1;
		}
	}
	
}

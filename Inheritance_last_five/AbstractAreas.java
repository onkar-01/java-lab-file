abstract class Figure {
	double dim1, dim2;

	Figure() {
		dim1 = dim2 = 1.0;
	}

	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

	abstract double area();
}

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a, b);
	}

	double area() {
		return dim1 * dim2;
	}
}

class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}

	double area() {
		return (dim1 * dim2) / 2;
	}
}

public class AbstractAreas {

	public static void main(String[] args) {
		// Figure f = new Figure(11.5, 13.5); //cannot instantiate abstract class
		Rectangle r = new Rectangle(12.5, 25.5);
		Triangle t = new Triangle(7.5, 13.5);
		Figure ref;

		ref = r;
		System.out.println("The area of rectangle " + ref.area());

		ref = t;
		System.out.println("The area of Tringle " + ref.area());

	}

}

package test;

/*
 * The class implements a triangle class which is an implementation of a shape.
 * Basic assumption is that the product of sides do not cross Doble.MAX_VALUE;
 */

public class Triangle implements Shape {
	
	private final double a, b, c; // sides
	
	enum Type {
	    EQUILATERAL, INVALID, ISOSCELES, SCALENE
	}
	
    public Triangle() {
        this(1,1,1);
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

	@Override
	public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	public double perimeter() {
		return a + b + c;
	}
	
	/*
	 * classify the type of triangle
	 * @return enum specifying the type of triangle.
	 */
	Type classify() {
	    if (a <= 0 || b <= 0 || c <= 0) return Type.INVALID;
	    if (a == b && b == c) return Type.EQUILATERAL;
	    if (a >= b+c || c >= b+a || b >= a+c) return Type.INVALID;
	    if (b==c || a==b || c==a) return Type.ISOSCELES;
	    return Type.SCALENE;
	}
}

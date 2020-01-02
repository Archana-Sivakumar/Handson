
public class Circle extends Shape {
	int radius;

	Circle(int radius) {
		super("Circle");
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	double calculateArea() {
		double areaOfCircle = 3.14 * radius * radius;
		return areaOfCircle;
	}
}

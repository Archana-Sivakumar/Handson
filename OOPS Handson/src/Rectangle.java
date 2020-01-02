
public class Rectangle extends Shape {
	int length;
	int breadth;

	Rectangle(int length, int breadth) {
		super("Rectangle");
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	double calculateArea() {
		int areaOfRectangle = length * breadth;
		return areaOfRectangle;
	}
}

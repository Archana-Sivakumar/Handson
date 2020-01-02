
public class Square extends Shape {
	int side;

	Square(int side) {
		super("Square");
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	double calculateArea() {
		double areaOfSquare = side * side;
		return areaOfSquare;
	}
}

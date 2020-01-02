public class Hexagon extends Shape {
	int side;

	Hexagon(int side) {
		super("Hexagon");
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	double calculateArea() {
		return 0;
	}
}

import java.util.Scanner;

public class AreaOfShapeMainHexagon {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("1.Rectangle \n 2.Square \n 3.Circle \n 4.Hexagon \n Area Calculator---Choose your shape");

		int option = s.nextInt();

		if (option == 1) {
			System.out.println("Enter length and breadth:");
			int length = s.nextInt();
			System.out.println();
			int breadth = s.nextInt();
			Rectangle rectangle = new Rectangle(length, breadth);
			System.out.print("Area of Rectangle is:");
			System.out.format("%.2f", rectangle.calculateArea());
		}

		if (option == 2) {
			System.out.println("Enter side:");
			int side = s.nextInt();
			Square square = new Square(side);
			System.out.print("Area of Square is:");
			System.out.format("%.2f", square.calculateArea());
		}

		if (option == 3) {
			System.out.println("Enter radius:");
			int radius = s.nextInt();
			Circle circle = new Circle(radius);
			System.out.print("Area of Circle is:");
			System.out.format("%.2f", circle.calculateArea());
		}

		if (option == 4) {
			System.out.println("Enter side:");
			int side = s.nextInt();
			Hexagon hexagon = new Hexagon(side);
			System.out.print("Area of Hexagon is:");
			System.out.format("%.2f", hexagon.calculateArea());
		}
	}
}

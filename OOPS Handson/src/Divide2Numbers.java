import java.util.Scanner;

public class Divide2Numbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = s.nextInt();

		System.out.println("Enter second number");
		int b = s.nextInt();
		int quotient;

		try {
			if (b != 0) {
				quotient = a / b;
				System.out.println("The quotient of " + a + "/" + b + "=" + quotient);
			} else {
				DivideByZeroException divide = new DivideByZeroException();
				throw divide;
			}
		} catch (DivideByZeroException divide) {
			System.out.println(divide.getMessage());
		} finally {
			System.out.println("Inside finally block");
		}

	}

}

import java.util.Scanner;

public class CompareIntegers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first number");
		int firstNum = s.nextInt();

		System.out.println("Enter the second number");
		int secondNum = s.nextInt();

		if (firstNum < secondNum) {
			System.out.println(firstNum + " is less than " + secondNum);
		}

		if (firstNum > secondNum) {
			System.out.println(firstNum + " is greater than " + secondNum);
		}

		if (firstNum == secondNum) {
			System.out.println(firstNum + " is equal to " + secondNum);
		}
	}
}

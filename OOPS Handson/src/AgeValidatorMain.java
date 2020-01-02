import java.util.Scanner;

public class AgeValidatorMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your age");
		int age = s.nextInt();
		try {
			if (age < 19) {
				InvalidAgeException invalid = new InvalidAgeException();
				throw invalid;
			} else {
				System.out.println("welcome to vote");
			}
		} catch (InvalidAgeException invalid) {
			System.out.println(invalid.getMessage());
		}
	}

}

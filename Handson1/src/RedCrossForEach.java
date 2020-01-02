import java.util.Scanner;

public class RedCrossForEach {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numberOfTents = s.nextInt();
		int totalCitizenNumber = 0;
		int[] numberOfRefugees = new int[numberOfTents];

		for (int i = 0; i < numberOfTents; i++) {
			numberOfRefugees[i] = s.nextInt();
		}

		for (int i = 0; i < numberOfTents; i++) {
			totalCitizenNumber += numberOfRefugees[i];
		}

		System.out.println(totalCitizenNumber);
	}
}

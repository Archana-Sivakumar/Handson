import java.util.Scanner;

public class RedCrossWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numberOfTents = s.nextInt();
		int totalCitizenNumber = 0;
		int i = 0;
		int[] numberOfRefugees = new int[numberOfTents];
		while (i < numberOfTents) {
			numberOfRefugees[i] = s.nextInt();
			totalCitizenNumber += numberOfRefugees[i];
			i++;
		}

		System.out.println(totalCitizenNumber);
	}
}

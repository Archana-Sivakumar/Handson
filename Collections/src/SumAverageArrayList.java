import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAverageArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);

		int totalPoints = 0;
		float averagePoints = 0;

		System.out.println("Enter number of matches");
		int noOfMatches = s.nextInt();
		int[] array = new int[noOfMatches];
		System.out.println("Enter the points scored in number of matches");
		for (int i = 0; i < noOfMatches; i++) {
			list.add(array[i] = s.nextInt());
		}

		for (int i : list) {
			totalPoints += i;
		}

		averagePoints = (float) totalPoints / noOfMatches;

		System.out.println("Total points is: " + totalPoints);
		System.out.print("Average is: ");
		System.out.format("%.2f", averagePoints);
	}

}

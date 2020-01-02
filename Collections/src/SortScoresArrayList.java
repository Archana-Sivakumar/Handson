import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortScoresArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of matches");
		int noOfMatches = s.nextInt();

		int[] array = new int[noOfMatches];
		System.out.println("Enter the runs scored in number of matches");
		for (int i = 0; i < noOfMatches; i++) {
			list.add(array[i] = s.nextInt());
		}
		Collections.sort(list);

		System.out.println("Sorted Scores:");
		for (int i : list) {
			System.out.println(i);
			;
		}
	}

}

import java.util.Scanner;

public class SortNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter number of elements in the array:");
		int n = s.nextInt();

		int array[] = new int[n];

		System.out.println("Enter elements of array:");

		for (int i = 0; i < n; i++) {
			
			array[i] = s.nextInt();
		}

		int temp;

		for (int i = 0; i < n; i++) {

			for (int j = 1; j < n-i; j++) {

				if (array[j-1] > array[j]) {

					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;

				}
			}
		}

		for (int i = 0; i < n; i++) {

			System.out.println(array[i]);
		}
		s.close();
	}

}

import java.util.Scanner;

public class LabAllocation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Lab1");
		int lab1 = s.nextInt();

		System.out.println("Enter Lab2");
		int lab2 = s.nextInt();

		System.out.println("Enter Lab3");
		int lab3 = s.nextInt();

		if (lab1 < lab2 && lab1 < lab3) {
			System.out.println("Lab1 has the minimal seating capacity");
		}

		if (lab2 < lab1 && lab2 < lab3) {
			System.out.println("Lab2 has the minimal seating capacity");
		}

		if (lab3 < lab1 && lab3 < lab2) {
			System.out.println("Lab3 has the minimal seating capacity");
		}
	}
}

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day number");
		int number = s.nextInt();

		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat" };
		System.out.println("Day of the week is " + days[number - 1]);
	}

}

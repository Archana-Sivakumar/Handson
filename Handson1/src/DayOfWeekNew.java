import java.util.Scanner;

public class DayOfWeekNew {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the day number");
		int number = s.nextInt();

		String[] days = new String[7];
		days[0] = "Sun";
		days[1] = "Mon";
		days[2] = "Tue";
		days[3] = "Wed";
		days[4] = "Thurs";
		days[5] = "Fri";
		days[6] = "Sat";

		System.out.println("Day of the week is " + days[number - 1]);

	}

}

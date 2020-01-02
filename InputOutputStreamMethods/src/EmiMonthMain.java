import java.text.ParseException;
import java.util.Scanner;

public class EmiMonthMain {

	public static void main(String[] args)  {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter date");
		String date = s.nextLine();

		EmiMonthCalculator.displayDate(date);

	}

}

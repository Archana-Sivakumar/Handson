
import java.text.ParseException;
import java.util.Scanner;

public class DisplayDate {
	public static void main(String[] args) throws ParseException  {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter date");
		String date = s.nextLine();

		UserMainCodeDate.displayDate(date);
	}
}
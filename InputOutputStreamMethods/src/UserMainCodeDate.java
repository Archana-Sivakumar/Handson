import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCodeDate {

	static void displayDate(String inputDate) throws ParseException  {
		DateFormat givenDate = new SimpleDateFormat("MMMM dd, yyyy");
		DateFormat modifyDate = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = givenDate.parse(inputDate);
			String formatDate = modifyDate.format(date);
			System.out.println(formatDate);
		} catch(ParseException p) {
			p.printStackTrace();
		}
	}
	
}

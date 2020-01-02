import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EmiMonthCalculator {
	static void displayDate(String inputDate) {
		
		try {
			Calendar calendar = Calendar.getInstance();
			Date modifyDate = new SimpleDateFormat("yyyy-dd-MM").parse(inputDate);
			DateFormat newDate = new SimpleDateFormat("yyyy-MM-dd");
			calendar.setTime(modifyDate);
			calendar.add(Calendar.MONTH, -20);
			Date date = calendar.getTime();
			String formatDate = newDate.format(date);
			System.out.println("20 months before " + inputDate + " will be " + formatDate);
		} catch(ParseException p) {
			p.printStackTrace();
		}
	}
}

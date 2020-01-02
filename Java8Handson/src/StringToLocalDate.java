import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {

	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate localDate = LocalDate.parse("28/01/1998", formatter);

		System.out.println("Converted Date format: " + localDate);

	}

}

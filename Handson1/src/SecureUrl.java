import java.util.Scanner;

public class SecureUrl {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");
		String givenString = s.next();
		System.out.println("Enter the start string");
		String startString = s.next();
		String subString = "";
		for (int i = 0; i < givenString.length(); i++) {
			if (givenString.charAt(i) == ':') {
				break;
			} else {
				subString += givenString.charAt(i);
			}
		}

		if (subString.equals(startString)) {
			System.out.println(givenString + " starts with https");
		} else {
			System.out.println(givenString + " does not starts with https");
		}
	}
}

import java.util.Scanner;

public class CricketCommentaryMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Menu \n 1.Player details of the delivery \r\n" + "\r\n" + "2.Run details of the delivery ");
		int option = s.nextInt();

		if (option == 1) {
			s.nextLine();
			System.out.println("Enter the bowler name");
			String bowlerName = s.nextLine();
			String newBowlerName = "";
			for (int i = 0; i < bowlerName.length(); i++) {
				if (bowlerName.charAt(i) == ' ') {
					newBowlerName = bowlerName.substring(i + 1);
				}
			}

			System.out.println("Enter the batsman name");
			String batsmanName = s.nextLine();
			String newBatsmanName = "";

			for (int i = 0; i < batsmanName.length(); i++) {
				if (batsmanName.charAt(i) == ' ') {
					newBatsmanName = batsmanName.substring(i + 1);
				}
			}
			System.out.println("Player details of the delivery:");
			CricketDelivery delivery = new CricketDelivery();
			delivery.displayDeliveryDetails(newBowlerName, newBatsmanName);

		}

		if (option == 2) {
			System.out.println("Enter the number of runs");
			Long numberOfRuns = s.nextLong();
			CricketDelivery delivery = new CricketDelivery();
			delivery.displayDeliveryDetails(numberOfRuns);
		}
	}
}

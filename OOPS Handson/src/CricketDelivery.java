
public class CricketDelivery {
	void displayDeliveryDetails(String bowler, String batsman) {
		System.out.println("Bowler : " + bowler);
		System.out.println("Botsman : " + batsman);
	}

	void displayDeliveryDetails(Long runs) {
		if (runs == 4) {
			System.out.println("Number of runs scored in the delivery:" + runs);
			System.out.println("It is a boundary");
		}

		else if (runs == 6) {
			System.out.println("Number of runs scored in the delivery:" + runs);
			System.out.println("It is a sixer");
		}

		else {
			System.out.println("Number of runs scored in the delivery:" + runs);
		}
	}
}

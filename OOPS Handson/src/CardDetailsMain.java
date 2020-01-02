import java.util.Scanner;

public class CardDetailsMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int j = 0;
		int k = 0;
		String cardHolderName = "";
		String cardNumber = "";
		String cardExpiryDate = "";

		System.out.println("Select the Card \n 1.Payback Card \n 2.Membership Card");
		int option = s.nextInt();

		if (option == 1) {
			System.out.println("Enter the Card Details:");
			String cardDetails = s.next();

			for (int i = 0; i < cardDetails.length(); i++) {
				if (cardDetails.charAt(i) == '|') {
					j = i;
					break;
				} else {
					cardHolderName += cardDetails.charAt(i);
				}
			}

			for (int i = j + 1; i < cardDetails.length(); i++) {
				if (cardDetails.charAt(i) == '|') {
					k = i;
					break;
				} else {
					cardNumber += cardDetails.charAt(i);
				}
			}

			for (int i = 0; i < cardDetails.length(); i++) {
				if (cardDetails.charAt(i) == '|') {
					break;
				} else {
					cardExpiryDate += cardDetails.charAt(i);
				}
			}

			System.out.println("Enter points in card");
			int pointsEarned = s.nextInt();

			System.out.println("Enter Amount");
			double totalAmount = s.nextDouble();

			System.out.println(cardHolderName + "'s Payback Card Details:");
			PaybackCard payBackCard = new PaybackCard(cardHolderName, cardNumber, cardExpiryDate, pointsEarned,
					totalAmount);

			payBackCard.setCardHolderName(cardHolderName);
			payBackCard.setCardNumber(cardNumber);
			payBackCard.setExpiryDate(cardExpiryDate);
			payBackCard.setPointsEarned(pointsEarned);
			payBackCard.setTotalAmount(totalAmount);

			System.out.println("Card Number " + payBackCard.getCardNumber());
			System.out.println("Ponits Earned " + payBackCard.getPointsEarned());
			System.out.println("Total Amount " + payBackCard.getTotalAmount());
		}

		if (option == 2) {
			System.out.println("Enter the Card Details:");
			String cardDetails = s.next();

			for (int i = 0; i < cardDetails.length(); i++) {
				if (cardDetails.charAt(i) == '|') {
					j = i;
					break;
				} else {
					cardHolderName += cardDetails.charAt(i);
				}
			}

			for (int i = j + 1; i < cardDetails.length(); i++) {
				if (cardDetails.charAt(i) == '|') {
					k = i;
					break;
				} else {
					cardNumber += cardDetails.charAt(i);
				}
			}

			for (int i = k + 1; i < cardDetails.length(); i++) {
				if (cardDetails.charAt(i) == '|') {
					break;
				} else {
					cardExpiryDate += cardDetails.charAt(i);
				}
			}

			System.out.println("Enter rating in card");
			int rating = s.nextInt();

			System.out.println(cardHolderName + "'s Membership Card Details:");
			MembershipCard memberShipCard = new MembershipCard(cardHolderName, cardNumber, cardExpiryDate, rating);

			memberShipCard.setCardHolderName(cardHolderName);
			memberShipCard.setCardNumber(cardNumber);
			memberShipCard.setExpiryDate(cardExpiryDate);
			memberShipCard.setRating(rating);

			System.out.println("Card Number " + memberShipCard.getCardNumber());
			System.out.println("Rating " + memberShipCard.getRating());
		}
	}
}

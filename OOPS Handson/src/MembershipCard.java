
public class MembershipCard extends CardDetails {
	private int rating;

	MembershipCard(String holderName, String cardNumber, String expiryDate, int rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public int getRating() {
		return this.rating = rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}

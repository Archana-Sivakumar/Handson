
public class PaybackCard extends CardDetails {
	private int pointsEarned;
	private double totalAmount;

	PaybackCard(String holderName, String cardNumber, String expiryDate, int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

	public int getPointsEarned() {
		return this.pointsEarned = pointsEarned;
	}

	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public double getTotalAmount() {
		return this.totalAmount = totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
}

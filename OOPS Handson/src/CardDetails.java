
abstract public class CardDetails {
	protected String holderName;
	protected String cardNumber;
	protected String expiryDate;

	CardDetails(String holderName, String cardNumber, String expiryDate) {
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

	public String getCardHolderName() {
		return this.holderName = holderName;
	}

	public void setCardHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCardNumber() {
		return this.cardNumber = cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return this.expiryDate = expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}


public class AccountTransaction {
	private String accountNumber;
	private int balance;

	public AccountTransaction(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return this.accountNumber = accountNumber;
	}

	public void setAcountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return this.balance = balance;
	}

	public void deposit(int transactionAmount) {
		int newDepositBalance = balance + transactionAmount;
		System.out.println("Your balance after the transaction is:" + newDepositBalance);
	}

	public void withdraw(int transactionAmount) {
		if (transactionAmount > balance) {
			System.out.println("Insufficient Balance");
			System.out.println("Your balance after the transaction is:" + balance);
		} else {
			int newWithdrawBalance = balance - transactionAmount;
			System.out.println("Your balance after the transaction is:" + newWithdrawBalance);
		}
	}
}

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Account Number");
		String accountNumber = s.next();
		System.out.println("Enter the Account Balance");
		int balance = s.nextInt();

		AccountTransaction obj = new AccountTransaction(accountNumber, balance);
		System.out.println("Enter 1 to deposit an amount,2 to withdraw an amount");
		int option = s.nextInt();

		if (option == 1) {
			System.out.println("Enter the amount to deposit");
			int depositAmount = s.nextInt();
			obj.deposit(depositAmount);
		}

		else {
			System.out.println("Enter the amount to withdraw");
			int withdrawAmount = s.nextInt();
			obj.withdraw(withdrawAmount);
		}

		obj.setAcountNumber(accountNumber);
		obj.getAccountNumber();
		obj.getBalance();
	}
}

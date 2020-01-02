import java.util.Scanner;

public class DiscountCalculation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Price of item 1:");
		double item1Price = s.nextDouble();

		System.out.println("Price of item 2:");
		double item2Price = s.nextDouble();

		System.out.println("Discount in percentage:");
		double discountPercent = s.nextDouble();

		double totalAmount = item1Price + item2Price;
		double discountedAmount = ((totalAmount) * (100 - discountPercent)) / 100;
		double savedAmount = totalAmount - discountedAmount;

		System.out.print("Total amount: $");
		System.out.format("%.2f", totalAmount);
		System.out.println();

		System.out.print("Discounteed amount: $");
		System.out.format("%.2f", discountedAmount);
		System.out.println();

		System.out.print("Saved amount: $");
		System.out.format("%.2f", savedAmount);
	}
}

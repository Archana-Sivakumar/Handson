import java.util.Scanner;

public class ProfitLossMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased");
		double dozenNumber = s.nextDouble();

		System.out.println("Enter the price per dozen");
		double costPerDozen = s.nextDouble();

		System.out.println("Enter the selling price of 1 toy");
		double sellingPrice = s.nextDouble();

		double costPrice = costPerDozen / 12;
		double profit = sellingPrice - costPrice;
		double profitPercent = (profit / costPrice) * 100;

		ProfitLossMethod obj = new ProfitLossMethod();
		double profitPeecentage = obj.calculateProfit(dozenNumber, costPerDozen, sellingPrice);

		System.out.print("Sam's profit percentage is" + " ");
		System.out.format("%.2f ", profitPercent);
		System.out.print("percent");
	}

	double calculateProfit(double dozenNumber, double costPerDozen, double sellingPrice) {
		double costPrice = costPerDozen / 12;
		double profit = sellingPrice - costPrice;
		double profitPercent = (profit / costPrice) * 100;
		return profitPercent;
	}
}

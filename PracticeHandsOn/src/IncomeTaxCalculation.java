import java.util.Scanner;

public class IncomeTaxCalculation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the salary");
		long salary = scanner.nextLong();
		
		long incomeTax = 0;
		
		if(salary <= 300000) {
			incomeTax = 0;
		}
		
		if(salary >= 300001 && salary <= 500000) {
			salary = salary - 250000;
			incomeTax += ( salary * 5)/100;
		}
		
		if(salary >= 500001 && salary <= 1000000) {
			
			salary = salary - 500000;
			incomeTax += (250000 * 5)/100 + (salary * 20)/100; 
		}
		
		if(salary > 1000000) {
			
			salary = salary - 1000000;
			incomeTax = (250000 * 5)/100 + (500000 * 20)/100 + (salary * 30)/100;
		}
		
        System.out.println(incomeTax);
        scanner.close();
	}

}

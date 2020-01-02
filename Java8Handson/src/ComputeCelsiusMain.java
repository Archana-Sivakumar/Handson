import java.util.Scanner;

public class ComputeCelsiusMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the fahrenheit temperature");
		double celsius = sc.nextDouble();
		
		System.out.println("In Anonymous class");
	    System.out.println(toCelsius(celsius));
		
	    System.out.println("Enter the fahrenheit temperature");
		double celsiusLambda = sc.nextDouble();
		
	    System.out.println("Using Lambda Expressions");
		System.out.println(toCelsiusLambda(celsiusLambda));
        sc.close();
	}

	public static double toCelsius(double fahrenheit) {
		
		ComputeCelsiusInterface celsius = new ComputeCelsiusInterface() {
			
			public double toCelsius(double fahrenheit) {
				return ((fahrenheit - 32)*5/9);
			}
		};
		double result = celsius.toCelsius(fahrenheit);
		return result;
	}
	
	 public static double toCelsiusLambda(double fahrenheit) {
		 
		 ComputeCelsiusInterface celsius = fahrenheitdegree -> ((fahrenheit - 32)*5/9);
		 double result = celsius. toCelsius(fahrenheit);
		 return result;
	 }
}

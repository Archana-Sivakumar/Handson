
public class MathExample {

	public static void main(String[] args) {

		System.out.println("Absolute value is:" + Math.abs(-3.5));

		System.out.println("Square root value is:" + Math.sqrt(144));

		System.out.println("Minimum value is" + Math.min(10, 20));

		System.out.println("Maximum value is:" + Math.max(20, 100));

		System.out.println("PI value is:" + Math.PI);

		double degrees = 60.0;
		double radians = Math.toRadians(degrees);
		System.out.println("60 degrees in radians:" + radians);

		System.out.println("degree value is:" + Math.toDegrees(radians));

		System.out.println("cosine of 60 degrees in radians:" + Math.cos(radians));

		System.out.println("sine of 60 degrees in radians" + Math.sin(radians));

		System.out.println("log value is:" + Math.log(degrees));

		System.out.println("exponential value is:" + Math.exp(degrees));
	}

}

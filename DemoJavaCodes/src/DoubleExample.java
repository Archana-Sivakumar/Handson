
public class DoubleExample {

	public static void main(String[] args) {
		double num1 = 45.23436547;
		String str = "45";
		Double num2 = new Double(num1);
		Double num3 = new Double(num1);
		System.out.println("toString(num1) = " + Double.toString(num1));

		Double num4 = Double.valueOf(num1);
		System.out.println("valueOf(num4) = " + num4);

		double num5 = Double.parseDouble(str);
		System.out.println("parseDouble(str) = " + num5);

		System.out.println("bytevalue(num2) = " + num2.byteValue());

		System.out.println("shortvalue(num2) = " + num2.shortValue());

		System.out.println("intvalue(num2) = " + num2.intValue());

		System.out.println("longvalue(num2) = " + num2.longValue());

		System.out.println("doublevalue(num2) = " + num2.doubleValue());

		System.out.println("floatvalue(num2) = " + num2.floatValue());

		System.out.println("x.equals(y) = " + num2.equals(num3));

		System.out.println("compare(num2,num3) = " + Double.compare(num2, num3));

		System.out.println("Double.toString(num1) = " + Double.toHexString(num1));

		System.out.println("Double.doubleToLongBits(num1) = " + Double.doubleToLongBits(num1));

	}

}


public class IntegerExample {

	public static void main(String[] args) {
		int num = 55;
		String str = "45";

		System.out.println("parseInt(str) = " + Integer.parseInt(str));

		System.out.println("toHexString(num) =" + Integer.toHexString(num));

		System.out.println("toOctalString(num) =" + Integer.toOctalString(num));

		System.out.println("toBinaryString(num) =" + Integer.toBinaryString(num));

		System.out.println("ValueOf(str) = " + Integer.valueOf(str));

	}

}

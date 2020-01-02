
public class ExceptionExample {

	public static void main(String[] args) {
		int a = 50;
		int b = 0;
		int c = 0;
		int[] arr = new int[5];
		int option = 1;
		try {
			if (option == 1) {
				c = a / b;
			} else {
				System.out.println(arr[7]);
			}
		} catch (ArithmeticException ae) {
			ae.getMessage();
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.getMessage();
		}
		System.out.println("Answer is:" + c);
		System.out.println(arr[4]);
	}

}

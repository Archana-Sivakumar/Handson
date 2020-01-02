
public class SumMarks {

	public static void main(String[] args) {
		int sum = 0, average = 0;
		int[] marks = { 50, 60, 50, 40, 80 };
		for (int i : marks) {
			sum += i;
		}
		average = sum / 5;
		System.out.println("Sum:" + sum);
		System.out.println("Average:" + average);
	}
}

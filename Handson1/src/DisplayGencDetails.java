import java.util.Scanner;

public class DisplayGencDetails {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of GenCs");

		int numberOfGenc = s.nextInt();

		int[] employeeId = new int[numberOfGenc];
		String[] name = new String[numberOfGenc];

		for (int i = 0, j = 0; i < numberOfGenc && j < numberOfGenc; i++, j++) {
			System.out.println("Enter Employee Id");
			employeeId[i] = s.nextInt();
			System.out.println("Enter Name");
			name[j] = s.next();
		}

		Student obj = new Student();
		obj.display(employeeId, name, numberOfGenc);
	}
}
/*
 * obj.setEmployeeId(employeeId); obj.setName(name);
 * obj.setNumberOfGenc(numberOfGenc);
 * 
 * obj.display(employeeId, name,numberOfGenc);
 * System.out.println(" Product Id is "+ obj.getEmployeeId());
 * System.out.println("Product Name is "+ obj.getName());
 * System.out.println("Supplier Name is "+ obj.getNumberOfGenc(numberOfGenc));
 */

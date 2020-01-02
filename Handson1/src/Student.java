
public class Student {
	private int employeeId[];
	private int numberOfGenc;
	private String name[];
	private static final String COHORT_CODE = "CHNAJ19004";

	void display(int employeeId[], String name[], int numberOfGenc) {
		for (int i = 0; i < employeeId.length; i++) {
			System.out.println(employeeId[i] + " " + name[i] + " " + COHORT_CODE);
		}
	}
}

/*
 * Student(int employeeId[], String name[], int numberOfGenc) {
 * this.employeeId[numberOfGenc] = employeeId[numberOfGenc];
 * this.name[numberOfGenc] = name[numberOfGenc]; this.numberOfGenc =
 * numberOfGenc; }
 * 
 * } public int getEmployeeId() { return this.employeeId[numberOfGenc]; }
 * 
 * public String getName() { return this.name[numberOfGenc]; }
 * 
 * public int getNumberOfGenc(int numberOfGenc) { return this.numberOfGenc; }
 * 
 * public void setEmployeeId(int[] employeeId) { this.employeeId[numberOfGenc] =
 * employeeId[numberOfGenc]; }
 * 
 * public void setName(String[] name) { this.name[numberOfGenc] =
 * name[numberOfGenc]; }
 * 
 * public void setNumberOfGenc(int numberOfGenc) { this.numberOfGenc =
 * numberOfGenc; }
 */

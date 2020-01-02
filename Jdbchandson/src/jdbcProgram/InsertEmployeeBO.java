package jdbcProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class InsertEmployeeBO {

	Scanner scanner = new Scanner(System.in);

	void addEmployee() throws ParseException {
		System.out.println("Enter the Employee Details");

		System.out.println("Enter the ID:");
		int empId = scanner.nextInt();

		System.out.println("Enter the name:");
		String empName = scanner.next();

		System.out.println("Enter the date of birth (dd/MM/yyyy):");
		String date = scanner.next();
		Date empDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);

		System.out.println("Enter the salary:");
		int empSalary = scanner.nextInt();

		Employee employee = new Employee(empId, empName, empDate, empSalary);
		employee.setEmployeeId(empId);
		employee.setName(empName);
		employee.setDateOfBirth(empDate);
		employee.setSalary(empSalary);

		EmployeeDao employeeDao = new EmployeeDao();
		int rows;
		try {
			rows = employeeDao.addEmployee(employee);
			System.out.println(rows + " rows affected");
			System.out.println("The Given data is successfully inserted to the database");
		} catch (ApplicationException e) {
			System.out.println(e.getMessage());
		}

		List<Employee> empList;
		try {
			empList = employeeDao.getAllEmployees();
			for (int i = 0; i < empList.size(); i++) {
				System.out.println(empList.get(i).getName() + " " + empList.get(i).getDateOfBirth() + " "
						+ empList.get(i).getSalary());
			}
		} catch (ApplicationException e) {
			System.out.println(e.getMessage());
		}

	}
}

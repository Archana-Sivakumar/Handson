import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMainMethod {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, "John", 25, 100000.00); 
		Employee employee2 = new Employee(2, "Jack", 22, 90000.00); 
		Employee employee3 = new Employee(3, "Laura", 38, 120000.00); 
		Employee employee4 = new Employee(4, "Smith", 28, 90000.00); 

		List<Employee> employees = new ArrayList<>(); 
		employees.add(employee1); 
		employees.add(employee2); 
		employees.add(employee3); 
		employees.add(employee4); 
		
		List<Employee> filtered = null;
		filtered = employees.stream().filter(employeeObj -> employeeObj.getEmployeeAge() < 30).collect(Collectors.toList());
		
		for(Employee emp : filtered) {
			System.out.println(emp);
		}
		
		
		double total = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
       System.out.println("Total Employees Salary : " + total);
	}
		
	}



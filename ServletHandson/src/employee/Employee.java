package employee;

public class Employee {
    private long empId;
    private String empName;
    private String gender;
    private String dateOfBirth;
    private String fulltimeEmployee;
    private String[] department;
    private long salary;
	public Employee(long empId, String empName,String gender, String dateOfBirth, String fulltimeEmployee, String[] department, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.fulltimeEmployee = fulltimeEmployee;
		this.department = department;
		this.salary = salary;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFulltimeEmployee() {
		return fulltimeEmployee;
	}
	public void setFulltimeEmployee(String fulltimeEmployee) {
		this.fulltimeEmployee = fulltimeEmployee;
	}
	
	
	public String[] getDepartment() {
		return department;
	}
	public void setDepartment(String[] department) {
		this.department = department;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}

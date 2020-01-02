package jdbcProgram;

import java.text.ParseException;

public class EmployeeBOMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertEmployeeBO insertEmployee = new InsertEmployeeBO();
		try {
			insertEmployee.addEmployee();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package jdbcProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDao {
	static Connection conn;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll", "root", "root");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	public int addEmployee(Employee employee) throws ApplicationException {

		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int rows = 0;

		Date newDate = employee.getDateOfBirth();
		java.sql.Date sqlDate = new java.sql.Date(newDate.getTime());
		try {

			if (conn != null) {
				String query = "insert into employee " + "(employee_id, name, date_of_birth, salary) values(?, ?, ?, ?)";
				pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, employee.getEmployeeId());
				pstmt.setString(2, employee.getName());
				pstmt.setDate(3, sqlDate);
				pstmt.setInt(4, employee.getSalary());
				rows = pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			int code = e.getErrorCode();
			String msg = e.getMessage();
			throw new ApplicationException(msg, code);
		}
		return rows;
	}

	List<Employee> getAllEmployees() throws ApplicationException {
		PreparedStatement pstmt = null;
		List<Employee> employeeList = null;
		Connection conn = getConnection();
		try {

			if (conn != null) {
				String selectQuery = "select employee_id, name, date_of_birth, salary from employee";
				pstmt = conn.prepareStatement(selectQuery);
				ResultSet rs = pstmt.executeQuery();
				employeeList = new ArrayList<Employee>();
				while (rs.next()) {
					Date empDate = rs.getDate(3);
					Employee empObj = new Employee(rs.getInt(1), rs.getString(2), empDate, rs.getInt(4));
					employeeList.add(empObj);
				}
			}
		} catch (SQLException e) {
			int code = e.getErrorCode();
			String msg = e.getMessage();
			throw new ApplicationException(msg, code);
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				int code = e.getErrorCode();
				String msg = e.getMessage();
				throw new ApplicationException(msg, code);
			}
		}
		return employeeList;
	}
}
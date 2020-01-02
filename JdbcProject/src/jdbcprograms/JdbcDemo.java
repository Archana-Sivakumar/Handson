package jdbcprograms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection();
			if (conn != null) {
				stmt = conn.createStatement();

				String query = "insert into student \r\n" + "values(4,'Uma',21,'Punjab'),\r\n"
						+ "(5,'Rekha',25,'Himachal'),\r\n" + "(6,'Rama',22,'Jammu');\r\n";
				int rows = stmt.executeUpdate(query);
				System.out.println(rows + " rows affected");
				System.out.println();
				
				
				System.out.println("Enter id to insert");
				int insertId = scanner.nextInt();
				
				System.out.println("Enter name to insert");
				String newName = scanner.next();
				
				System.out.println("Enter age to insert");
				int insertAge = scanner.nextInt();
				
				System.out.println("Enter state to insert");
				String newState = scanner.next();
				
				String insertQuery = "insert into student" + "(st_id, st_name, st_age,st_state) values("+insertId+",'"+newName+"',"+insertAge+",'"+newState+"')";
				int insertRows = stmt.executeUpdate(insertQuery);
				System.out.println(insertRows + " rows affected");
				System.out.println();

				
				System.out.println("Enter the id to delete");
				int newId = scanner.nextInt();
				String delQuery = "delete from student where st_id = (" + newId + ")";
				int delRows = stmt.executeUpdate(delQuery);
				System.out.println(delRows + " rows affected");
				System.out.println();

				System.out.println("Enter the id to update");
				int updateId = scanner.nextInt();
				System.out.println("Enter the age to update");
				int newAge = scanner.nextInt();
				String updateQuery = "update student set st_age= (" + newAge + ") where st_id = (" + updateId + ")";
				int updateRows = stmt.executeUpdate(updateQuery);
				System.out.println(updateRows + " rows affected");
				System.out.println();

				String selectQuery = "select st_id, st_name, st_age,st_state from student";
				rs = stmt.executeQuery(selectQuery);
				while (rs.next()) {
					System.out.println(rs.getInt("st_id") + "  " + rs.getString("st_name") + "  " + rs.getInt("st_age")
							+ "  " + rs.getString("st_state"));
				}
				System.out.println();

				System.out.println("Enter the id to select");
				int selectId = scanner.nextInt();
				String newselectQuery = "select st_id, st_name, st_age,st_state from student where st_id = (" + selectId + ")";
				rs = stmt.executeQuery(newselectQuery);
				while (rs.next()) {
					System.out.println(rs.getInt("st_id") + "  " + rs.getString("st_name") + "  " + rs.getInt("st_age")
							+ "  " + rs.getString("st_state"));
				}
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}

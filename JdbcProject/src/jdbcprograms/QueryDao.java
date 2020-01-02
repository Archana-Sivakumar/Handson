package jdbcprograms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDao {
	
	Connection conn = DBUtil.getConnection();
	Statement stmt = null;
	ResultSet rs = null;
	int rows = 0;

	public int insertMethod(int insertId, String insertName, int insertAge, String insertState) {
		try {
			//conn = DBUtil.getConnection();
			if (conn != null) {
				stmt = conn.createStatement();
				String insertQuery = "insert into student" + "(st_id, st_name, st_age,st_state) values(" + insertId
						+ ",'" + insertName + "'," + insertAge + ",'" + insertState + "')";
				rows = stmt.executeUpdate(insertQuery);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		  }
		return rows;
	}

	
	public int deleteMethod(int deleteId) {
		try {
			//conn = DBUtil.getConnection();
			if (conn != null) {
				stmt = conn.createStatement();
				String delQuery = "delete from student where st_id = (" + deleteId + ")";
				rows = stmt.executeUpdate(delQuery);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		  }
		return rows;
	}
	

	public int updateMethod(int updateId, int updateAge) {
		try {
			//conn = DBUtil.getConnection();
			if (conn != null) {
				stmt = conn.createStatement();
				String updateQuery = "update student set st_age= (" + updateAge + ") where st_id = (" + updateId + ")";
				rows = stmt.executeUpdate(updateQuery);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		  }
		return rows;
	}

	
	public void selectMethod() {
		try {
			//conn = DBUtil.getConnection();
			if (conn != null) {
				stmt = conn.createStatement();
				String newselectQuery = "select st_id, st_name, st_age,st_state from student";
				rs = stmt.executeQuery(newselectQuery);
				System.out.println("Id" +" "+ "Name" +" "+ "Age" +" "+ "State");
				while (rs.next()) {
					System.out.println(rs.getInt("st_id") + "  " + rs.getString("st_name") + "  " + rs.getInt("st_age")
							+ "  " + rs.getString("st_state"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
          }
	}
}
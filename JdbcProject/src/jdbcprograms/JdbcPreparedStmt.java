package jdbcprograms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcPreparedStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			if (conn != null) {
				String query = "insert into student " + "(st_id, st_name, st_age, st_state) values(?, ?, ?, ?)";
				pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, 7);
                pstmt.setString(2, "John");
                pstmt.setInt(3, 30);
                pstmt.setString(4, "Gujarat");
				int rows = pstmt.executeUpdate();
				System.out.println(rows + " rows affected");
				System.out.println();
				
			    String newselectQuery = "select st_id, st_name, st_age,st_state from student where st_id = ?";
				pstmt = conn.prepareStatement(newselectQuery);                                 
				pstmt.setInt(1,1);      
				rs = pstmt.executeQuery();       
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
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

}
	}
	

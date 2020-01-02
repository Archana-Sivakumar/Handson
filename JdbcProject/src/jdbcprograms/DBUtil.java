package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    static Connection connection;
    static {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
    
    static Connection getConnection() {
        if(connection == null) {
        	try {
        		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root");
        } catch(SQLException e) {
        	e.printStackTrace();
        }
    }
    return connection;
    
}
}
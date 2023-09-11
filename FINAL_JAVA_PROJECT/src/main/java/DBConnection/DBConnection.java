package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String URL="jdbc:mysql://localhost:3306/amdocs";
	private static final String USER_NAME="root";
	private static final String PASSWORD="Sachin@123";

	private static Connection connection;	
	
	public static Connection getConnection() {
		try {
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Connection Seccess");
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Error : Connection Not Established\n" + e );
		}
		return connection;
	}
}
	
	
	




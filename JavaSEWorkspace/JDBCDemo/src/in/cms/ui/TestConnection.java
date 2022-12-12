package in.cms.ui;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "root");
			System.out.println("connected.");
		} catch (ClassNotFoundException e) {
			System.out.println("unable to load the driver class");
		} catch (SQLException e) {
			System.out.println("unable to connect");
		}

	}

}

package in.cms.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmsdb", "root", "root");
			String sql = "INSERT INTO emp VALUES (6, 'kamal', 26000, 10)";
			Statement st = con.createStatement();
			int rowsInserted = st.executeUpdate(sql);
			if (rowsInserted == 1)
				System.out.println("row inserted");
			else
				System.out.println("unable to insert");
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("unable to load the driver class");
		} catch (SQLException e) {
			System.out.println("unable to connect");
		}


	}

}

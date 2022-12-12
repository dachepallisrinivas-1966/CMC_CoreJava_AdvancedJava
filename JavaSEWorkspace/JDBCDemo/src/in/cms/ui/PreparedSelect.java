package in.cms.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedSelect {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmsdb", "root", "root");
			String sql = "SELECT empno,ename,salary,dname FROM emp JOIN dept using (deptno)";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.printf("%-5d%-20s%10.2f%10s\n", rs.getInt("empno"), rs.getString("ename"), rs.getDouble("salary"), rs.getString("dname"));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("unable to load the driver class");
		} catch (SQLException e) {
			System.out.println("unable to connect");
		} finally {
			try {
				pst.close();
				rs.close();
				con.close();
				
			} catch(SQLException excep) {
				System.out.println(excep.getMessage());
			}
		}
	}

}

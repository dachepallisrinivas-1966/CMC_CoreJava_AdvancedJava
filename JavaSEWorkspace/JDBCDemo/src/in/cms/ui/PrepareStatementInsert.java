package in.cms.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementInsert {

	public static void main(String[] args) {
		Scanner scan = null;
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmsdb", "root", "root");
			String sql = "INSERT INTO emp VALUES (?, ?, ?, ?)";
			pst = con.prepareStatement(sql);
			
			scan = new Scanner(System.in);
			
			while (true) {
			
				System.out.print("Enter empno: [0 to stop]: ");
				int empno = scan.nextInt();
				if (empno == 0)
					break;
				System.out.print("Enter ename: ");
				String ename = scan.next();
				System.out.print("Enter salary: ");
				double salary = scan.nextDouble();
				System.out.print("Enter deptno: ");
				int deptno = scan.nextInt();
				
				pst.setInt(1, empno);
				pst.setString(2, ename);
				pst.setDouble(3, salary);
				pst.setInt(4, deptno);
				
				int rowsInserted = pst.executeUpdate();
				if (rowsInserted == 1)
					System.out.println("row inserted");
				else
					System.out.println("unable to insert");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("unable to load the driver class");
		} catch (SQLException e) {
			System.out.println("unable to connect");
		} finally {
			try {
				pst.close();
				con.close();
				scan.close();
			} catch(SQLException excep) {
				System.out.println(excep.getMessage());
			}
		}
 

	}

}

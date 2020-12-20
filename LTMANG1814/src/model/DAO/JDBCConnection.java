package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection 
{
	public static Connection getJDBCConnection()
	{
		Connection conn =null;
		final String url = "jdbc:mysql://localhost:3306/testltm";
		final String user="root";
		final String pass="0905394956";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn= DriverManager.getConnection(url,user,pass);
		}catch(ClassNotFoundException e) { e.printStackTrace();}
		 catch(SQLException e) {e.printStackTrace();}
		return conn;
	}
	public static void main(String[] args) {
		if(getJDBCConnection() != null) System.out.print("Ket noi thanh cong");
		else System.out.print("Ket noi ko thanh cong");		
	}
}

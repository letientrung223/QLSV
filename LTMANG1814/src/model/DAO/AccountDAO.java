package model.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

import model.bean.Account;
public class AccountDAO 
{
	// tra ve acc, kiem tra xem da co account trong database hay chua
	public static Account getAccount(String _id, String _pass) 
	{
		List<Account> accList = new ArrayList<>();
		 Connection connection = JDBCConnection.getJDBCConnection();
		 try {
			Statement stm = connection.createStatement();
			String sql ="Select * from account";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next())
			{
				
				String id  = rs.getString("id");
				String pass= rs.getString("pass");
				String info= rs.getString("info");
				Account acc = new Account(id,pass,info);
				accList.add(acc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 for (Account a : accList)
		 {
			 if ((a.getId().equals(_id)) &&(a.getPass().equals(_pass)))
			 {return a;}
		 }
		return null;
		
	}
	}

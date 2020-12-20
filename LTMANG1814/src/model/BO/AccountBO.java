package model.BO;

import java.sql.SQLException;

import model.DAO.AccountDAO;
import model.bean.Account;

public class AccountBO {

	public static Account getAccount(String id, String pass) throws ClassNotFoundException, SQLException 
	{
		return AccountDAO.getAccount(id,pass);
	}

}

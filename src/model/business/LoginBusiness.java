package model.business;
import java.sql.SQLException;

import model.dataccess.LoginDataAccess;
import model.entities.User;

public class LoginBusiness{
	
	private static LoginBusiness instance;
	private String userName;
	private String password;
	
	private LoginBusiness() {
		instance = this;
	
	}
	
	public static LoginBusiness getInstance() {
		return instance;
	}
	
	public Boolean verifyCredentials() throws ClassNotFoundException, SQLException {
		LoginDataAccess loginDataAccess = LoginDataAccess.getInstance();
		User user = new User(userName, password);
		boolean val = loginDataAccess.verifyCredentials(user);
		return val;
	}

	public void setUserName(String userName) {
		
		this.userName = userName;
		
		
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
package model.dataccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.dataccess.*;

import model.entities.User;

public class LoginDataAccess {
	private static LoginDataAccess instance;
	
	
	private LoginDataAccess(){
		instance = this;
		
	}

	public Boolean verifyCredentials(User user) throws ClassNotFoundException, SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory(); 
		DataBaseConnection connection = connectionFactory.getConnection("postgres");

		final PreparedStatement stmt = connection.getDataBaseConnection().prepareStatement("SELECT * FROM users WHERE username=? and password=?");

		stmt.setString(1, user.getUserName());
		stmt.setString(2, user.getPassword());

		ResultSet rs = stmt.executeQuery();

		return rs.next();
		
	}
	public static LoginDataAccess getInstance() {
		if(instance == null) {
			instance = new LoginDataAccess();
		}
		return instance;
		
	}

}


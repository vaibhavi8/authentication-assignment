package model.dataccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection implements DataBaseConnection{
	
	@Override
	public Connection getDataBaseConnection() throws ClassNotFoundException, SQLException {
		
		
		return null;
		
	}

	

	
}
package model.dataccess;

public class ConnectionFactory{
	
	public DataBaseConnection getConnection(String dataBase) {
		if(dataBase==null) {
			return null;
		}
		else if (dataBase.equalsIgnoreCase("postgres")) {
			return new PostgresConnection();
		}
		else if (dataBase.equalsIgnoreCase("MySqlConnection")) {
			return new MySqlConnection();
		}
		return null;
	}
	
}

package model.entities;

public class User {
	
	private String userName;
	
	private String password;
	
	private static User instance;
	
	public User (String userName, String password) {
		this.userName = userName;
		this.password = password;
		instance = this;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static User getInstance() {
		return instance;
	}
	
}

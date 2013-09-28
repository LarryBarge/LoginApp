package com.bargebq.Apps.Service;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.util.HashMap;

import com.bargebq.Apps.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	
	
	public LoginService(){
		users.put("Larry", "Larry Barge");
		users.put("Katie","Katie Cross");
	}//constructor to setup a hashmap with names. 
	//This should be where the connection to the database goes!
	
	//Connect to database and authenticate a list of users against 
	//the user parameters passed
	public boolean authenticate(String userId, String password){
		//dummy impl.
		if(password == null || password.trim() == "" || !users.containsKey(userId)){
			return false;
		}
		else 
			return true;
	}
	
	public User setUserDetails(String userId, String Special){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		user.setSpecial(Special);
		return user;
	}
	
	//Connecting to database and returns said connection. This is specific to 
		//the LAN database. STRAIGHT COPY OF DBUtils.
//	public Connection getConnection() throws SQLException{
//		Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.107/project1","danny","dannyboy");
//		return con;
//	}
	
	
}

package com.coderscampus.assignment3;


public class UserService {
	// Create user method
	 public User createUser(String username, String password, String name) {
		 User user = new User(username, password, name);
		 user.setUsername(username);
		 user.setPassword(password);
		 user.setName(name);
		 return user;
		 
	 }
}
	
////public class UserService{
////	
////	
////	//create the method that build a user object
////	public User createUser(String username, String password, String name) {
////		User user = new User(username, password, name);
////		user.setUsername(username);
////		user.setPassword(password);
////		user.setName(name);
////		return user; 
//		
//	}
//	
//}
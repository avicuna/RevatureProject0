package com.revature.daos;

import com.revature.beans.User;

public interface UserDao {
	
public static final UserDao currentUserDao = UserSerializer.us;
	
	/**
	 * Takes in a user object and will persist that user
	 * 
	 * @param u
	 */
	void createUser(User u);
	User findByUsernameAndPassword(String username, String password);
	void depositYeet(double yeet);
	void withdrawYeet(double yeet);
	void addHistory(String newHistory);
	String getHistory();
	double getBalance();
	void updateUser(User u);
	void deleteUser(User u);

}
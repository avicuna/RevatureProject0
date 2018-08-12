package com.revature.daos;

import com.revature.beans.Admin;
import com.revature.beans.User;

public interface AdminDao {
	public static final AdminDao currentAdminDao = AdminSerializer.as;
	
	void createAdmin(Admin a);
	void getUsers();
	void getUserTransactionHistory(User u);

}

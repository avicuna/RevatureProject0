package com.revature.screens;

import java.util.Scanner;

import com.revature.beans.Admin;
import com.revature.daos.AdminDao;

public class ViewUsersHistory implements Screen {
	private Admin current;
	
	private Scanner scan = new Scanner(System.in);
	private AdminDao ad = AdminDao.currentAdminDao;
	

	public ViewUsersHistory(Admin current) {
		super();
		// TODO Auto-generated constructor stub
		this.current = current;
	}

	@Override
	public Screen start() {
		// TODO Auto-generated method stub
		System.out.println("Enter the user's username to view their transaction history: ");
		System.out.println("Enter 0 to exit.");
		String selection = scan.nextLine();
		if(selection == "0")
			return new AdminHomeScreen(current);
		else {
			ad.viewUserTransactionHistory(selection);
		}
		return this;
	}

}

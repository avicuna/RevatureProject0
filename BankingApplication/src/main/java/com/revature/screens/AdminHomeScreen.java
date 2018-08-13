package com.revature.screens;

import java.util.Scanner;

import com.revature.beans.Admin;
import com.revature.daos.AdminDao;

public class AdminHomeScreen implements Screen {
	private Admin current;
	
	private Scanner scan = new Scanner(System.in);
	private AdminDao ad = AdminDao.currentAdminDao;

	public AdminHomeScreen(Admin current) {
		super();
		this.current = current;
	}



	@Override
	public Screen start() {
		// TODO Auto-generated method stub
		System.out.println("Please choose from the following options: ");
		System.out.println("Enter 1 to view users");
		System.out.println("Enter 2 to get user transaction info");
		System.out.println("Enter 3 to logout");
		String selection = scan.nextLine();
		switch (selection) {
		case "1":
			ad.viewAllUsers();
			break;
		case "2":
			System.out.println("Sorry! Get user transaction info not yet implemented.");
			break;
		case "3":
			return new AdminLoginScreen();
		default:
			break;
		}
		return this;
	}

}

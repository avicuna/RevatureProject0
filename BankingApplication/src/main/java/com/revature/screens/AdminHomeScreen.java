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
		String selection = scan.nextLine();
		switch (selection) {
		case "1":
			System.out.println("Sorry! View users not yet implemented.");
			break;
		case "2":
			System.out.println("Sorry! Get user transaction info not yet implemented.");
			break;
		default:
			break;
		}
		return this;
	}

}

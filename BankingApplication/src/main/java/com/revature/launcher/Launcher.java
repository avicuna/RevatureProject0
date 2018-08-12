package com.revature.launcher;

import org.apache.log4j.Logger;

import com.revature.screens.LoginScreen;
import com.revature.screens.Screen;

public class Launcher {
	private static Logger log = Logger.getRootLogger();
	public static void main(String[] args) throws InterruptedException {
		log.trace("trace log");
		log.debug("debug log");
		log.info("info log");
		log.warn("warn log");
		log.error("error log");
		log.fatal("fatal log");
		Thread.sleep(1000);
		System.out.println("Welcome to MemeTrust, we make memes even danker.");
		Screen s = new LoginScreen();
		while(true) {
			s = s.start();
		}

	}

}

package com.revature.launcher;

import org.apache.log4j.Logger;

import com.revature.other.Art;
import com.revature.screens.Screen;
import com.revature.screens.StartScreen;

public class Launcher {
	public static Art myart = new Art();
	private static Logger log = Logger.getRootLogger();
	public static void main(String[] args) throws InterruptedException {
		log.trace("trace log");
		log.debug("debug log");
		log.info("info log");
		log.warn("warn log");
		log.error("error log");
		log.fatal("fatal log");
		Thread.sleep(2000);
		myart.displayArt();
		System.out.println("\n\nWelcome to MemeTrust, we make memes even danker.");
		Screen s = new StartScreen();
		while(true) {
			s = s.start();
		}

	}

}

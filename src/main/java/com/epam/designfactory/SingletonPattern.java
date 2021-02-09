package com.epam.designfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonPattern {

	private static SingletonPattern getBrowserInstance = null;
	private WebDriver driver;

	private SingletonPattern() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static SingletonPattern getInstance() {
		if (getBrowserInstance == null) {
			getBrowserInstance = new SingletonPattern();
		}
		return getBrowserInstance;
	}

	public WebDriver getDriver() {
		return driver;
	}
}

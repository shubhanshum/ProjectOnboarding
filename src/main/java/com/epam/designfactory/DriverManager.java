package com.epam.designfactory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

	protected WebDriver driver;
	protected abstract void startService();
	protected abstract void stopService();
	protected abstract void createDriver();
	
	public WebDriver getDriver() {
		if (driver==null) {
			startService();
			createDriver();
		}
		return driver;
	}
	
	public void quitDriver() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}
}

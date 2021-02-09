package com.epam.designfactory;


public class DriverManagerFactory {

	public static DriverManager getManager(DriverType type) {
		DriverManager driverManager = null;
		switch(type) {
		case CHROME:
			driverManager=new ChromeDriverManager();
			break;
		}
		return driverManager;
	}
}

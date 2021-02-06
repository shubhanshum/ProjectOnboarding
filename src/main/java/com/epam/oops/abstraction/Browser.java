package com.epam.oops.abstraction;

public interface Browser {
	
	/**
	 * open the specified browser
	 * @param browserName
	 */
	void openBrowser(String browserName);
	
	/**
	 * closes the already opened browser
	 */
	void closeBrowser();
}

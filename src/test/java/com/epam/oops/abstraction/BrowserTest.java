package com.epam.oops.abstraction;

import org.testng.annotations.Test;

public class BrowserTest {

	@Test
	public void getBrowserAndNavigate() {
		Browser browser=new BrowserFactory();
		browser.openBrowser("chrome");
		browser.closeBrowser();
	}
}

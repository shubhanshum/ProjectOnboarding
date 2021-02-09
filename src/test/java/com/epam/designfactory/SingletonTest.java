package com.epam.designfactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

	@Test
	public void singletonClassTest() {
		SingletonPattern obj=SingletonPattern.getInstance();
		WebDriver driver=obj.getDriver();
		driver.get("https://www.google.com");
		driver.close();
	}
}

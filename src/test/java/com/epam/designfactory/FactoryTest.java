package com.epam.designfactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactoryTest {

	DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }
    
    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }
    
    @Test
    public void launchGoogle() {
    	driver.get("https://www.google.com/");
    }
}

package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReusableClass {

	public static WebDriver driver;

	// Launch Browser
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\GreensTechnology\\CucumberParallelTestNG\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	// Launch URL
	public static void launchUrl(String value) {
		driver.get(value);
		driver.manage().window().maximize();
	}

	// Fill---sendKeys
	public static void fill(WebElement e, String value) {
		e.sendKeys(value);
	}
}

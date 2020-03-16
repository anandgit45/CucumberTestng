package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionLogin {

	WebDriver driver;

	@Given("^User is on facebook login page$")
	public void user_is_on_facebook_login_page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arun\\Downloads\\chromedriver_win32--79\\chromedriver.exe");
		//driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		System.out.println("Anand");
	}

	@When("^User enter the \"([^\"]*)\" and \"([^\"]*)\" and Login$")
	public void user_enter_the_and_and_Login(String s1, String s2) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);

	}

	@Then("^user validate the result$")
	public void user_validate_the_result() throws Throwable {
		System.out.println("successfull");

	}
}

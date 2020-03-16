package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.ReusableClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends ReusableClass {
		
	@Before
	public void beforeExecution() {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
	}
	
	@After
	public void afterScenario(Scenario sc) {
		if(sc.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] src = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(src, "image/png");		
		}
	}
}

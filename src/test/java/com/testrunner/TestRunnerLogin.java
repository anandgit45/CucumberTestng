package com.testrunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src\\test\\resources" }, glue = {
		"com.stepdefinition" }, monochrome = true, dryRun = false, plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class TestRunnerLogin extends AbstractTestNGCucumberTests {

	@DataProvider(parallel = true)
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@BeforeClass
	public static void beforeClass() {

		String report = System.getProperty("user.dir") + "src\\test\\resources\\Reports\\Extent Report ";
		System.setProperty("screenshot.dir", report + "/Screenshot");
		System.setProperty("extent.reporter.spark.start", "true");
		System.setProperty("extent.reporter.spark.out", report);

	}

}

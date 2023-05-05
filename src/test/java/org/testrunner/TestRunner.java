package org.testrunner;

import org.baseclass.BaseClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\CucumberAssesment\\src\\test\\java\\Assesment.features",
				glue = "org.stepdefenition",
//				plugin = {"html:target/sauce.html",
//						  "json:target/sauce.json",
//						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
			dryRun = false)
public class TestRunner {
	
	public static WebDriver driver;

	@BeforeClass

	public static void browser() {

		driver = BaseClass.launchBrowser("chrome");
	
	}
	

}

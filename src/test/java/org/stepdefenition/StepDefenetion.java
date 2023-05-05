package org.stepdefenition;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pompage.HomePage;
import org.pompage.LoginPage;

import io.cucumber.java.en.*;

public class StepDefenetion extends BaseClass {

	LoginPage lp = new LoginPage(driver);
	HomePage Hp = new HomePage(driver);

	String a = "";
	String b = "";
	String c = "";

	@Given("The user should login the application with valid credentials")
	public void the_user_should_login_the_application_with_valid_credentials() {
		urlLaunch(
				"https://basecopy5.staging.pg-test.com/auth/sign-in?postLoginRedirect=/hub/newhub503949860203/home-v3");
		dynamicWait(10);

	}

	@When("The user should Click on any {int} career paths as per his\\/her inspiration")
	public void the_user_should_click_on_any_career_paths_as_per_his_her_inspiration(Integer int1)
			throws InterruptedException {

		sendKeys(lp.getEmailId(), "test+7@peoplegrove.com");
		sendKeys(lp.getPassword(), "Testing@123");
		click(lp.getLogin());
		StaticWait(8000);

	}

	@When("The user should store the recently viewed careers in collections")
	public void the_user_should_store_the_recently_viewed_careers_in_collections() throws InterruptedException {

		movetoelement(Hp.getCareer());
		StaticWait(2000);
		click(Hp.getCareerPath());

		WebElement mining = driver.findElement((By.xpath("(//div[text()='Mining and Geological Engineers'])[1]")));
		String recentlyviewed1 = mining.getText();
		a = recentlyviewed1;
		click(Hp.getMining());

		click(Hp.getBackpath());
		WebElement sdet = driver.findElement((By.xpath("(//div[text()='Test Engineer in SDET'])[1]")));
		String recentlyviewed2 = sdet.getText();
		b = recentlyviewed2;
		click(Hp.getSdet());
		click(Hp.getBackpath());
		WebElement industrialenng = driver.findElement((By.xpath("(//div[text()='Industrial Engineers'])[1]")));
		String recentlyviewed3 = industrialenng.getText();
		c = recentlyviewed3;

		click(Hp.getIndustrialEngineer());
		click(Hp.getBackpath());

		List<String> li = new LinkedList<>();
		li.add(recentlyviewed1);
		li.add(recentlyviewed2);
		li.add(recentlyviewed3);

		for (String x : li) {
			System.out.println(x);

		}

	}

	@When("The user go back on home page and refresh")
	public void the_user_go_back_on_home_page_and_refresh() {

		click(Hp.getBtnHome());
		driver.navigate().refresh();
		javaScriptScroll(Hp.getScroll());

	}

	@Then("The user verifies the list is reversed when compared to recently viewed careers list")
	public void the_user_verifies_the_list_is_reversed_when_compared_to_recently_viewed_careers_list() {
		List<WebElement> afterrefresh = driver
				.findElements(By.xpath("//div[@class='CardMeta-module_title__Pec8b Card-module_metaTitle__kce94']"));

		for (int i = 0; i <= afterrefresh.size() - 1; i++) {
			WebElement text = afterrefresh.get(i);
			String text2 = text.getText();

			System.out.println(text2);

		}

		Assert.assertEquals("verify 1 value", a, afterrefresh.get(2).getText());
		Assert.assertEquals("verify 1 value", b, afterrefresh.get(1).getText());
		Assert.assertEquals("verify 1 value", c, afterrefresh.get(0).getText());

	}

}

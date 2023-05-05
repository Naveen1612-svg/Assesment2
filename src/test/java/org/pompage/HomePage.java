package org.pompage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;

	@FindBy(xpath = "//div[@id='navlist-ele-1']")
	private WebElement Career;
	@FindBy(xpath = "//li[@id='tab-option-0']")
	private WebElement Jops;
	@FindBy(xpath = "//div[@class='contextual-info JOB_TITLE']")
	private WebElement userprofile;
	@FindBy(xpath = "(//button[@type='button'])[13]")
	private WebElement Convobutton;
	@FindBy(xpath = "//p[text()='Career Paths']")
	private WebElement CareerPath;
	// career page
	@FindBy(xpath = "(//div[text()='Mining and Geological Engineers'])[1]")
	private WebElement mining;
	
	@FindBy(xpath = "(//div[text()='Test Engineer in SDET'])[1]")
	private WebElement sdet;
	
	@FindBy(xpath = "(//div[text()='Industrial Engineers'])[1]")
	private WebElement IndustrialEngineer;
	
	@FindBy(xpath = "//span[text()='Career Paths']")
	private WebElement Backpath;
	
	@FindBy(xpath = "//button[text()='Home']")
	private WebElement btnHome;
	
	@FindBy(xpath = "//span[text()='The following drives you']")
	private WebElement scroll;
	

	public WebElement getScroll() {
		return scroll;
	}

	public void setScroll(WebElement scroll) {
		this.scroll = scroll;
	}

	public WebElement getBtnHome() {
		return btnHome;
	}

	public WebElement getBackpath() {
		return Backpath;
	}

	public WebElement getCareerPath() {
		return CareerPath;
	}

	public WebElement getMining() {
		return mining;
	}

	public void setMining(WebElement mining) {
		this.mining = mining;
	}

	public WebElement getSdet() {
		return sdet;
	}

	public void setSdet(WebElement sdet) {
		this.sdet = sdet;
	}

	public WebElement getIndustrialEngineer() {
		return IndustrialEngineer;
	}

	public void setIndustrialEngineer(WebElement industrialEngineer) {
		IndustrialEngineer = industrialEngineer;
	}

	public void setCareerPath(WebElement careerPath) {
		CareerPath = careerPath;
	}

	public HomePage(WebDriver driver2) {

		HomePage.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getCareer() {
		return Career;
	}

	public void setCareer(WebElement career) {
		Career = career;
	}

	public WebElement getJops() {
		return Jops;
	}

	public void setJops(WebElement jops) {
		Jops = jops;
	}

	public WebElement getUserprofile() {
		return userprofile;
	}

	public void setUserprofile(WebElement userprofile) {
		this.userprofile = userprofile;
	}

	public WebElement getConvobutton() {
		return Convobutton;
	}

	public void setConvobutton(WebElement convobutton) {
		Convobutton = convobutton;
	}

}

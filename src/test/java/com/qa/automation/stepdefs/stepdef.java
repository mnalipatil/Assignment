package com.qa.automation.stepdefs;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.automation.PageObjectModel.HeaderSecPageObjects;
import com.qa.automation.PageObjectModel.LandingPageObjects;
import com.qa.automation.com.WebDriverFactory;

import org.apache.logging.log4j.Logger;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepdef{
	
	private static final Logger Logger = LogManager.getLogger(stepdef.class);
	WebDriver driver;
	WebDriverWait wait;
	String BaseURl="https://automationexercise.com/";
	int implictlyWaitTimeoutsec = 20;
	Scenario scn;
	LandingPageObjects landingPageObjects;
	HeaderSecPageObjects headerSecPageObjects;
	
	@Before
	public void setup(Scenario scn) throws Exception
	{
		this.scn = scn;
        String browserName= WebDriverFactory.getBrowserName();
        driver = WebDriverFactory.getWebDriverForBrowser(browserName);
        wait = new WebDriverWait(driver,implictlyWaitTimeoutsec);
        landingPageObjects = new LandingPageObjects(driver);
        headerSecPageObjects = new HeaderSecPageObjects(driver);
	}
	
	@After(order=1)
	public void cleanUP()
	{
		WebDriverFactory.quitDriver();
		Logger.info("Driver closed");
	}
	
	@After(order=2)
	public void takeScreenShot(Scenario s)
	{
		if(s.isFailed())
		{
			TakesScreenshot scrnShot = (TakesScreenshot)driver;
			byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
			scn.attach(data, "image/png", "Failed Step Name: " + s.getName());
		}
		else
		{
			scn.log("Test case is passed, no screen shot captured");
		}
	}
	
	@Given("user navigate to the home applicatoon URL {string}")
	public void user_navigate_to_the_home_applicatoon_url(String URL) {
		WebDriverFactory.navigateToTheUrl(URL);
	}
	
	@Then("user verify the home page is visible with title as {string}")
	public void user_verify_the_home_page_is_visible_with_title_as(String HomePageTitle) {
		landingPageObjects.validateHomePageTitle(HomePageTitle);
	}
	
	@Given("user click to product button")
	public void user_click_to_product_button() {
		landingPageObjects.clickProductBtn();
	}
	
	@When("user verify to the product page with title as {string}")
	public void user_verify_to_the_product_page_with_title_as(String ProductPageTitle) {
		headerSecPageObjects.verifyProductPageTitle(ProductPageTitle);
	}
	
	@Then("user click to cart button")
	public void user_click_to_cart_button() {
		landingPageObjects.clickCartBtn();
	}
	
	@Then("user verify to the cart page with title as {string}")
	public void user_verify_to_the_card_page_with_title_as(String CartPageTitle) {
		headerSecPageObjects.verifyCartPageTitle(CartPageTitle);
	}
	
	@Then("user click to signup\\/login button")
	public void user_click_to_signup_login_button() {
		landingPageObjects.clickSighunLoginBtn();
	}
	
	@Then("user verify to the signup\\/login page with title as {string}")
	public void user_verify_to_the_signup_login_page_with_title_as(String SignupLoginPageBtnEle) {
		headerSecPageObjects.verifySighnupLoginPageTitle(SignupLoginPageBtnEle);
	}
	
	@Then("user click to Test Cases button")
	public void user_click_to_test_cases_button() {
		landingPageObjects.clickTestCasesBtn();
	}
	@Then("user verify to the Test Cases page with title as {string}")
	public void user_verify_to_the_test_cases_page_with_title_as(String TestCasesPageTitle) {
		headerSecPageObjects.verifyTestCasesPageTitle(TestCasesPageTitle);
	}
	
	@Then("user click to API Testing button")
	public void user_click_to_api_testing_button() {
		landingPageObjects.clickApiTestingBtn();
	}
	
	@Then("user verify to the API Testing page with title as {string}")
	public void user_verify_to_the_api_testing_page_with_title_as(String APITestingPageTitle) {
		headerSecPageObjects.verifyApiTestingPageTitle(APITestingPageTitle);	
	}
	
	@Then("user click to video tutorials button")
	public void user_click_to_video_tutorials_button() {
		landingPageObjects.clickVideoTitorialsBtn();
	}

	@Then("user verify to the video tutorials page with url as {string}")
	public void user_verify_to_the_video_tutorials_page_with_url_as(String url) {
		headerSecPageObjects.verifyVideoTutorialPageUrl(url);
	}

	@Then("user click to Contact us button")
	public void user_click_to_contact_us_button() {
		landingPageObjects.clickContactUsBtn();
	}
	
	@Then("user validate to the Contact us page with title as {string}")
	public void user_validate_to_the_contact_us_page_with_title_as(String ContactUsPagrTitle) {
		headerSecPageObjects.verifyContactUsPageTitle(ContactUsPagrTitle);	
	}
	
	@Given("user scroll down the home page")
	public void user_scroll_down_to_home_page() {
		landingPageObjects.scrollDownTheHomePage();
	}

	@When("user verify the text {string}")
	public void user_verify_the_text(String SUBSCRIPTION) {
		landingPageObjects.verifySubscriptionText(SUBSCRIPTION);
	}
	
	@Then("user enter email address {string}")
	public void user_enter_email_address(String emailAddress) {
		landingPageObjects.EnterEmailAddress(emailAddress);
	}
	
	@And("user click on arrow button")
	public void user_click_on_arrow_button() {
		landingPageObjects.ClickedOnArrowBtn();
	}
	
	@Then("displayed success message {string} is visible")
	public void displayed_success_message_is_visible(String SuccessMsg) {
		landingPageObjects.VerifySuccessMsg(SuccessMsg);

	}

}

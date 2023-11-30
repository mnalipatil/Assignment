package com.qa.automation.PageObjectModel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class LandingPageObjects {
	
	private static final Logger logger = LogManager.getLogger(LandingPageObjects.class);
	 private WebDriver driver;
	 private WebDriverWait wait;
	 Scenario scn;
	 
	 public LandingPageObjects(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 //Page Locators
	 private By ClickProductBn = By.xpath("//a[text()=' Products']");
	 private By ClickCartBtn = By.xpath("//a[text()=' Cart']");
	 private By ClickSignUpLoginBtn = By.xpath("//a[text()=' Signup / Login']");
	 private By ClickTestCasesBTnEle = By.xpath("//a[text()=' Test Cases']");
	 private By ClickAPITestingBtn = By.xpath("//a[text()=' API Testing']");
	 private By ClickVideoTutorialBtn = By.xpath("//a[text()=' Video Tutorials']");
	 private By ClickContactUsBTn = By.xpath("//a[text()=' Contact us']");
	 private By subscriptiontextEle = By.xpath("//h2[text()='Subscription']");
	 private By SubEmailAddress = By.xpath("//input[@id='susbscribe_email']");
	 private By clickArrowBtn = By.xpath("//button[@id='subscribe']");
	 private By SuccessMsgVisible = By.xpath("//div[text()='You have been successfully subscribed!']"); ////div[@class='alert-success alert']
	 //Page Methods
	 public void validateHomePageTitle(String HomePageTitle)
	 {
			Assert.assertEquals(true,driver.getTitle().contains(HomePageTitle));
	 }
	 
	 public void clickProductBtn()
	 {
			WebElement ClickProductBnEle = driver.findElement(ClickProductBn);
			ClickProductBnEle.click();
	 }

	 public void clickCartBtn()
	 {
			WebElement ClickCartBtnEle = driver.findElement(ClickCartBtn);
			ClickCartBtnEle.click();
	 }
	 
	 public void clickSighunLoginBtn()
	 {
			WebElement ClickSignUpLoginBtnEle = driver.findElement(ClickSignUpLoginBtn);
			ClickSignUpLoginBtnEle.click();
	 }
	 
	 public void clickTestCasesBtn()
	 {
			WebElement ClickTestCasesBTn = driver.findElement(ClickTestCasesBTnEle);
			ClickTestCasesBTn.click();
	 }
	 
	 public void clickApiTestingBtn()
 	 {
			WebElement ClickAPITestingBtnEle = driver.findElement(ClickAPITestingBtn);
			ClickAPITestingBtnEle.click();
	 }
	 
	 public void clickVideoTitorialsBtn()
	 {
			WebElement ClickVideoTutorialBtnEle = driver.findElement(ClickVideoTutorialBtn);
			ClickVideoTutorialBtnEle.click();
	 }
	 
	 public void clickContactUsBtn()
	 {
			WebElement ClickContactUsBTnEle = driver.findElement(ClickContactUsBTn);
			ClickContactUsBTnEle.click();
	 }
	 
	 public void scrollDownTheHomePage()
	 {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 }
	 
	 public void verifySubscriptionText(String SUBSCRIPTION)
	 {
			WebElement subscriptiontext = driver.findElement(subscriptiontextEle);
			Assert.assertEquals(SUBSCRIPTION,subscriptiontext.getText());
	 }
	 
	 public void EnterEmailAddress(String emailAddress)
	 {
			WebElement SubEmailAddressEle = driver.findElement(SubEmailAddress);
			SubEmailAddressEle.sendKeys("emailAddress");
	 }
	 
	 public void ClickedOnArrowBtn()
	 {
			WebElement clickArrowBtnEle = driver.findElement(clickArrowBtn);
			clickArrowBtnEle.click();
	 }
	 
	 public void VerifySuccessMsg(String SuccessMsg)
	 {
			WebElement SuccessMsgVisibleEle = driver.findElement(SuccessMsgVisible);
			Assert.assertEquals(SuccessMsg,SuccessMsgVisibleEle.getText());
	 }
}

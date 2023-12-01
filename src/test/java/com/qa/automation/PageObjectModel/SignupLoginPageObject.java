package com.qa.automation.PageObjectModel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class SignupLoginPageObject {

	private static final Logger logger = LogManager.getLogger(SignupLoginPageObject.class);
	 private WebDriver driver;
	 private WebDriverWait wait;
	 Scenario scn;
	 
	 public SignupLoginPageObject(WebDriver driver)
	 {
		 this.driver=driver;
	     wait = new WebDriverWait(driver, 15);

	 }
	 
	 //Page locators
	 private By LoginToYourText = By.xpath("//h2[text()='Login to your account']");
	 private By EmailIdLog = By.xpath("//input[@placeholder='Email Address']");
	 private By PasswordLog = By.xpath("//input[@placeholder='Password']");
	 private By LoginBtn = By.xpath("//button[@data-qa='login-button']");
	 private By ErrorMsg = By.xpath("//p[text()='Your email or password is incorrect!']");
	 private By LoginToYrAcText = By.xpath("//h2[text()='Login to your account']");
	 private By EmailId = By.xpath("//input[@placeholder='Email Address']");
	 private By Password = By.xpath("//input[@placeholder='Password']");

	//page methods
	 public void verifyLoginPageTitle(String LoginPageTitle)
	 {
	    	wait.until(ExpectedConditions.titleContains(LoginPageTitle));
			Assert.assertEquals(true,driver.getTitle().contains(LoginPageTitle));
	 }
	 
	 public void verifyLoginToYourAcText(String LoginToYourAccount)
	 {
			WebElement LoginToYourAccountText = driver.findElement(LoginToYourText);////h2[text()='Login to your account']
			Assert.assertEquals(LoginToYourAccount,LoginToYourAccountText.getText());
	 }
	 
	 public void verifyEmailIdForLogin(String emailIdforLogin)
	 {
			WebElement emailIdEle = driver.findElement(EmailIdLog);
			emailIdEle.sendKeys(emailIdforLogin);
	 }
	 
	 public void verifyPassForLogin(String PasswordForLogin)
	 {
			WebElement PasswordEle = driver.findElement(PasswordLog);
			PasswordEle.sendKeys(PasswordForLogin);
	 }
	 
	 public void verifyClickToLoginBtn()
	 {
			WebElement clickToLoginBtnEle = driver.findElement(LoginBtn);
			clickToLoginBtnEle.click();	
	 }
	 
	 public void verifyErrorMsgVisible(String ErrorMsgVisible)
	 {
			WebElement ErrorMsgEle = driver.findElement(ErrorMsg); ////p[text()='Your email or password is incorrect!']
			Assert.assertEquals(true,ErrorMsgEle.getText().contains(ErrorMsgVisible));
	 }
	 
	 public void VerifyLoginPageTitle(String LoginPageTitle)
	 {
	    	wait.until(ExpectedConditions.titleContains(LoginPageTitle));
			Assert.assertEquals(true,driver.getTitle().contains(LoginPageTitle));
	 }
	 
	 public void verifyLoginToYourAccountText(String LoginToYourAccount)
	 {
			WebElement LoginToYourAccountText = driver.findElement(LoginToYrAcText);////h2[text()='Login to your account']
			Assert.assertEquals(LoginToYourAccount,LoginToYourAccountText.getText());

	 }
	 
	 public void verifyEmail(String emailIdforLogin)
	 {
			WebElement emailIdEle = driver.findElement(EmailId);
			emailIdEle.sendKeys(emailIdforLogin);
	 }
	 
	 public void verifyPassword(String PasswordForLogin)
	 {
			WebElement PasswordEle = driver.findElement(Password);
			PasswordEle.sendKeys(PasswordForLogin);
	 }
	 
}

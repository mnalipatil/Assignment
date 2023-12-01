

package com.qa.automation.PageObjectModel;

import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class HeaderSecPageObjects {
	
	private static final Logger logger = LogManager.getLogger(HeaderSecPageObjects.class);
	 private WebDriver driver;
	 private WebDriverWait wait;
	 Scenario scn;
	 
	 public HeaderSecPageObjects(WebDriver driver)
	 {
		 this.driver=driver;
	     wait = new WebDriverWait(driver, 15);

	 }
	 
	 //page locators
	 
	 
	 //page methods
	 public void verifyProductPageTitle(String ProductPageTitle)
	 {
		 	wait.until(ExpectedConditions.titleContains(ProductPageTitle));
			Assert.assertEquals(true,driver.getTitle().contains(ProductPageTitle));
	 }

	public void verifyCartPageTitle(String CartPageTitle)
	 {
	 		wait.until(ExpectedConditions.titleContains(CartPageTitle));
			Assert.assertEquals(true,driver.getTitle().contains(CartPageTitle));
	 }
	 
	 public void verifySighnupLoginPageTitle(String SignupLoginPageBtnEle)
	 {
		 	wait.until(ExpectedConditions.titleContains(SignupLoginPageBtnEle));
			Assert.assertEquals(true,driver.getTitle().contains(SignupLoginPageBtnEle));
	 }
	 
	 public void verifyTestCasesPageTitle(String TestCasesPageTitle)
	 {
		 	wait.until(ExpectedConditions.titleContains(TestCasesPageTitle));
			Assert.assertEquals(true,driver.getTitle().contains(TestCasesPageTitle));
	 }
	 
	 public void verifyApiTestingPageTitle(String APITestingPageTitle)
	 {
		 	wait.until(ExpectedConditions.titleContains(APITestingPageTitle));
			Assert.assertEquals(true,driver.getTitle().contains(APITestingPageTitle));
	 }
	 
	 public void verifyVideoTutorialPageUrl(String VideoTutorialPageUrlKeyword)
	 {
	    	wait.until(ExpectedConditions.urlContains(VideoTutorialPageUrlKeyword));
			Assert.assertEquals(true,driver.getCurrentUrl().contains(VideoTutorialPageUrlKeyword));
	 }
	 
	 public void verifyContactUsPageTitle(String ContactUsPagrTitle)
	 {
		 	wait.until(ExpectedConditions.titleContains(ContactUsPagrTitle));
			Assert.assertEquals(true,driver.getTitle().contains(ContactUsPagrTitle));
	 }
}

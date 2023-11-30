

package com.qa.automation.PageObjectModel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
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
	 }
	 
	 //page locators
	 
	 
	 //page methods
	 public void verifyProductPageTitle(String ProductPageTitle)
	 {
			Assert.assertEquals(true,driver.getTitle().contains(ProductPageTitle));

	 }

	 public void verifyCartPageTitle(String CartPageTitle)
	 {
			Assert.assertEquals(true,driver.getTitle().contains(CartPageTitle));
	 }
	 
	 public void verifySighnupLoginPageTitle(String SignupLoginPageBtnEle)
	 {
			Assert.assertEquals(true,driver.getTitle().contains(SignupLoginPageBtnEle));
	 }
	 
	 public void verifyTestCasesPageTitle(String TestCasesPageTitle)
	 {
			Assert.assertEquals(true,driver.getTitle().contains(TestCasesPageTitle));
	 }
	 
	 public void verifyApiTestingPageTitle(String APITestingPageTitle)
	 {
			Assert.assertEquals(true,driver.getTitle().contains(APITestingPageTitle));
	 }
	 
	 public void verifyVideoTutorialPageUrl(String url)
	 {
			driver.navigate().forward();
			Assert.assertEquals(true,driver.getCurrentUrl().contains(url));
	 }
	 
	 public void verifyContactUsPageTitle(String ContactUsPagrTitle)
	 {
			Assert.assertEquals(true,driver.getTitle().contains(ContactUsPagrTitle));
	 }
}

package TestScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import pageObject.HomePage;
import pageObject.LaunchScreen;
import pageObject.LoginPage;
import pageObject.MobileActions;
import pageObject.ProductListing;
import pageObject.ProductPage;
import pageObject.SearchPage;
import settings.Base;
//import pageObjects.FormPage;
import utilities.Log;

public class TestScript2 extends Base {

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		System.out.println("Before Method executed..!");

		AndroidDriver<AndroidElement> driver = capabilities("Amazon_shopping");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testExecution() throws IOException, InterruptedException {

		LaunchScreen launching = new LaunchScreen(driver);
		launching.skipSignIn.click();
		/***********************************************************************************
		 * search Page
		 **********************************************************************************/

		SearchPage productSearch = new SearchPage(driver);
		productSearch.tapOnSearch.click();

		/**** Search product item taken from properties file *****/

		productSearch.tapOnSearch.sendKeys(prop.getProperty("searchItem"));

		Log.startLog(".............cfgdgdfgdfo");

		/*****************************************************************
		 * 1. SearchProduct method called 2. in the parameter userSuggItem from
		 * properties file called
		 ******************************************************************/

		productSearch.SearchProduct(prop.getProperty("userSuggItem"));

		// assertTrue("autoSuggList".equalsIgnoreCase("userSuggestedItem"));

		/**** Search product based on Index *****/

		System.out.println("Search by Index......." + productSearch.searchByIndex.get(3).getText());
		productSearch.searchByIndex.get(2).click();

		/***********************************************************************************
		 * Product Listing page
		 **********************************************************************************/

		/**** Scroll on the product *****/
		//String text="Philips 164 cm (65 inches) 6700 Series 4K Ambilight LED";
		// String ProdScroll="Philips 164 cm (65 inches) 6700 Series 4K Ambilight LED
		// Smart TV 65PUT6703S/94 (Dark Sliver)";
		//String ProdScroll = prop.getProperty("scrollOnProd");
		//System.out.println("Get property value for Scroll on Elmenet...." + ProdScroll);
		MobileActions s = new MobileActions(driver);
		//String text = prop.getProperty("scrollOnProd");
		//String text="Philips 164 cm (65 inches) 6700 Series 4K Ambilight LED";
		//String text="abc";
		
		s.scrollToText("Philips 164 cm (65 inches) 6700 Series 4K Ambilight LED Smart TV 65PUT6703S/94 (Dark Sliver)");
		
		
		
		//((WebElement) ScrollToClick).click();
		/**** Ignore Select location pop up *****/
		ProductListing touchOutside = new ProductListing(driver);
		touchOutside.selectLocationId();
		
		


	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After Method executed..!");

	}
}

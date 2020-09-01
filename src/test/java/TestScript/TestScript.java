package TestScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.apache.log4j.Logger;
import org.testng.annotations.Test;
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

import PageObject.HomePage;
import PageObject.LaunchScreen;
import PageObject.LoginPage;
import PageObject.SearchPage;

import Utilities.Log;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import settings.Base;
//import pageObjects.FormPage;

public class TestScript extends Base {

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		System.out.println("Before Method executed..!");

		AndroidDriver<AndroidElement> driver = capabilities("Amazon_shopping");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testExecution() throws IOException, InterruptedException {

		// System.out.println(prop.getProperty("username"));
		// System.out.println(prop.getProperty("password"));
		// Log.class()
		LaunchScreen launching = new LaunchScreen(driver);
		launching.signInButton.click();
		Thread.sleep(3000);

		// Log.startLog(SearchPage:"test is started" );

		LoginPage login = new LoginPage(driver);
		// login.getText();
		// Log.startLog(testClassName);
		// driver.findElement(By.xpath(
		// "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText"))
		// .sendKeys("username");
		// HomePage home = new HomePage(driver);
		// login.signInButton.click();
		// login.getuserName();
		login.userName.sendKeys(prop.getProperty("username"));
		// login.userName.sendKeys("9330024800");
		Thread.sleep(3000);
		login.continueButton.click();
		login.password.sendKeys(prop.getProperty("password"));
		// login.password.sendKeys("admin#123");
		Thread.sleep(3000);
		login.loginButton.click();
		Thread.sleep(3000);

		/**** On search Page *****/
		SearchPage productSearch = new SearchPage(driver);

		/**** Search product given from user input *****/
		productSearch.tapOnSearch.sendKeys(prop.getProperty("searchItem"));

		/**** Tap on Auto Suggestion List *****/

		// productSearch.autoSugg.click();

		productSearch.getautoSugg();

		// TouchAction action = new TouchAction(driver).tap(x+60, y+260).release();
		// action.perform();

	}

	@AfterMethod
	public void tearDown() {
		System.out.println("After Method executed..!");

	}
}

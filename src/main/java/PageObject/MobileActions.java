package PageObject;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MobileActions {
	LoginPage TestScript;
	SearchPage SearchPage;
	private AndroidDriver<AndroidElement> driver;

	public MobileActions(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;

		/******************** tap on search Bar **********************************/

		TouchAction action = new TouchAction(driver);
		WebElement searchTap = SearchPage.tapOnSearch;
		action.tap(tapOptions().withElement(element(searchTap))).perform();

	}

	/******************** Using Scroll **********************************/

	public void scrollToText(String text) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
	}

}

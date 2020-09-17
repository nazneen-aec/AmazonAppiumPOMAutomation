package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.Log;

public class ProductListing {

	
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/touch_outside")
	public WebElement ignoreLocationId;
	// @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\" your_text\")")
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
	
	
	public ProductListing(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	public WebElement selectLocationId() {
		if(ignoreLocationId.isDisplayed())
		{
			
			ignoreLocationId.click();
		}
		else{
			
			System.out.println("Select Location pop up not appeared");
		}
	return ignoreLocationId;
	}
	

}

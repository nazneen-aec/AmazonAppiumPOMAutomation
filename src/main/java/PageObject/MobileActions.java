package pageObject;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.model.Log;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import settings.Base;


public class MobileActions{
	
	SearchPage SearchPage;
	String text = "your_text";
	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\" your_text\")")
	
	public WebElement scrollonProd;
// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
	
	
	public MobileActions(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	/******************** tap on search Bar **********************************/

		//TouchAction action = new TouchAction(driver);
		//WebElement searchTap = SearchPage.tapOnSearch;
		//action.tap(tapOptions().withElement(element(searchTap))).perform();
		
		
		//TouchAction action1 = new TouchAction(driver);
		//final WebElement slider = fluentWait().until( elementToBeClickable( className( "android.widget.SeekBar" ) ) );
	     
		
		/*********** Mobile Action Touch by co-ordinates*********************/
		
		
		//SearchPage.SearchProduct();
		//System.out.println(SearchPage.SearchProduct());
		
		//int x=SearchPage.x;
		//int y=SearchPage.y;
		
		//TouchAction newAction1 = new TouchAction(driver).tap(x+60, y+260).release();
		

	
		
	public WebElement scrollToText(String text)
	{
	    System.out.println("Hello to scroll Elements");
	    scrollonProd.click();
		return scrollonProd;
	}
	
	
	
	/******************** Using Scroll **********************************/

	
	
	

	
	
}

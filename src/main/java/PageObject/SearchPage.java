package pageObject;

import static org.testng.Assert.assertTrue;

import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.j2objc.annotations.Property;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import settings.Base;
import utilities.Log;

public class SearchPage {

	// String text = "mobile watch";
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
	public WebElement tapOnSearch;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='mobile watch']")
	// @AndroidFindBy(xpath ="//*[contains(text(), '\"+userSuggestedItem+\"')]")

	
	// @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\\\"\" +
	// userSuggestedItem + \"\\\")")

		public List<WebElement> autoSugg;
	
	@AndroidFindBy(id ="com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_suggestions")
	public List<WebElement> searchByIndex;

	public SearchPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	/*
	 * 
	 * public WebElement SearchProduct() {
	 * 
	 * x = tapOnSearch.getLocation().getX(); y = tapOnSearch.getLocation().getY();
	 * 
	 * System.out.println("X value: " + x + " Y value: " + y);
	 * Log.info("value of x== " + x); Log.info("value of x== " + y);
	 * 
	 * return tapOnSearch;
	 * 
	 * }
	 */

	public List<WebElement> SearchProduct(String userSuggestedItem) {

		// System.out.println("Actual Search result :\n" +
		// productSearch.autoSugg.get(3).getText());
		// productSearch.autoSugg.get(3).click();
		// prop.getProperty(userSuggestedItem);
		System.out.println("fetch from properties file...." + userSuggestedItem);
		System.out.println("size" + autoSugg.size());

		for (WebElement autoSuggList : autoSugg) {
			// System.out.println("fetch from for loop..." + autoSuggList);
			System.out.println("gettext value..........." + autoSuggList.getText());
			if (autoSuggList.getText().contains(userSuggestedItem)) {
				/// System.out.println("xyz......" + autoSuggList.getText());

				autoSuggList.click();
				System.out.println("autoSuggList clicked......");
				break;
			} else {

				System.out.println("autoSuggList ........Not able to found");
				
			}
			
		}

		return autoSugg;
		
		}
	
	
	//System.out.println("searchByIndex Item from the List....");
	
	//	+ searchByIndex.get(3).getText()

	
	
}

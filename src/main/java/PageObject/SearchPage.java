package PageObject;

import static org.testng.Assert.assertTrue;

import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchPage {

	public SearchPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/rs_search_src_text")
	public WebElement tapOnSearch;

	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/iss_search_dropdown_item_text\\n")
	public List<WebElement> autoSugg;
	
	
	public List<WebElement> getautoSugg() {

		for (WebElement autoSuggList : autoSugg) {
			assertTrue("autoSuggList".equalsIgnoreCase("mobile 123watch"));
			autoSuggList.click();
			System.out.println("Got result ");
		}

		return autoSugg;

	}
}




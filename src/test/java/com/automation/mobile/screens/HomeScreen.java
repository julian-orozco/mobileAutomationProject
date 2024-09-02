package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    private static final String WEB_DRIVER_TITLE = "UiSelector().textContains(\"WEBDRIVER\")";
    private static final String WEB_VIEW_BTN = "Webview";

    @AndroidFindBy(uiAutomator = WEB_DRIVER_TITLE)
    private WebElement webDriverTitle;

    @AndroidFindBy(accessibility = WEB_VIEW_BTN)
    private WebElement webViewBtn;

    public boolean webDriverTitleDisplayed(){
        this.waitElementIsDisplayed(this.webDriverTitle);
        return this.webDriverTitle.isDisplayed();
    }

    public WebViewScreen tapWebViewBtn(){
        this.waitElementIsDisplayed(this.webViewBtn);
        this.webViewBtn.click();
        return new WebViewScreen(this.driver);
    }


    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }
}

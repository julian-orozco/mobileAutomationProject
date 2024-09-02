package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomeScreen extends BaseScreen {

    private static final String WEB_DRIVER_TITLE = "UiSelector().textContains(\"WEBDRIVER\")";
    @AndroidFindBy(uiAutomator = WEB_DRIVER_TITLE)
    private WebElement webDriverTitle;


    public boolean webDriverTitleDisplayed(){
        this.waitElementIsDisplayed(this.webDriverTitle);
        return this.webDriverTitle.isDisplayed();
    }

    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }
}

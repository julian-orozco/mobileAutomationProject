package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebViewScreen extends BaseScreen {
    private static final String WEB_DRIVER_IO_LOGO = "UiSelector().textContains(\"WebdriverIO\")";
    private static final String HAMBURGER_BTN = "UiSelector().textContains(\"Toggle navigation bar\")";
    private static final String MAIN_TXT = "UiSelector().textContains(\"Next-gen browser and mobile automation test framework for Node.js\")";
    private static final String SEARCH_BTN = "UiSelector().textContains(\"Search\")";


    @AndroidFindBy(uiAutomator = WEB_DRIVER_IO_LOGO)
    private WebElement webDriverIOLogo;

    @AndroidFindBy(uiAutomator = HAMBURGER_BTN)
    private WebElement hamburgerBtn;

    @AndroidFindBy(uiAutomator = MAIN_TXT)
    private WebElement mainTxt;

    @AndroidFindBy(uiAutomator = SEARCH_BTN)
    private WebElement searchBtn;

    public boolean webDriverLogoDisplayed(){
        this.waitElementIsDisplayed(this.webDriverIOLogo);
        return this.webDriverIOLogo.isDisplayed();
    }

    public boolean hamburgerBtnDisplayed(){
        this.waitElementIsDisplayed(this.hamburgerBtn);
        return this.hamburgerBtn.isDisplayed();
    }

    public boolean maintxtDisplayed(){
        this.waitElementIsDisplayed(this.mainTxt);
        return this.mainTxt.isDisplayed();
    }

    public boolean searchBtnDisplayed(){
        this.waitElementIsDisplayed(this.searchBtn);
        return this.searchBtn.isDisplayed();
    }

    public WebViewScreen(AndroidDriver driver) {
        super(driver);
    }
}

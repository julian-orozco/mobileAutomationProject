package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebViewScreen extends BaseScreen {
    private static final String WEB_DRIVER_IO_LOGO = "UiSelector().textContains(\"WebdriverIO\")";
    private static final String LOGIN_BTN = "Login";

    @AndroidFindBy(uiAutomator = WEB_DRIVER_IO_LOGO)
    private WebElement webDriverIOLogo;

    @AndroidFindBy(accessibility = LOGIN_BTN)
    private WebElement loginBtn;

    public boolean webDriverLogoDisplayed(){
        this.waitElementIsDisplayed(this.webDriverIOLogo);
        return this.webDriverIOLogo.isDisplayed();
    }

    public LoginScreen tapLoginBtn(){
        this.waitElementIsDisplayed(this.loginBtn);
        this.loginBtn.click();
        return new LoginScreen(this.driver);
    }

    public WebViewScreen(AndroidDriver driver) {
        super(driver);
    }
}

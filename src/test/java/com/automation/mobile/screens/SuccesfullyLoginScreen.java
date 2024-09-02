package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SuccesfullyLoginScreen extends BaseScreen {
    private static final String SUCCESS_MSG = "UiSelector().textContains(\"You are logged in!\")";

    @AndroidFindBy(uiAutomator = SUCCESS_MSG)
    private WebElement successMsg;


    public boolean successMsgDisplayed(){
        this.waitElementIsDisplayed(this.successMsg);
        return this.successMsg.isDisplayed();
    }


    public SuccesfullyLoginScreen(AndroidDriver driver) {
        super(driver);
    }
}

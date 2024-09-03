package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SuccesfullyLoginScreen extends BaseScreen {
    private static final String SUCCESS_MSG = "UiSelector().textContains(\"You are logged in!\")";
    private static final String OK_BTN = "UiSelector().resourceId(\"android:id/button1\")";

    @AndroidFindBy(uiAutomator = SUCCESS_MSG)
    private WebElement successMsg;

    @AndroidFindBy(uiAutomator = OK_BTN)
    private WebElement okBtn;

    public boolean successMsgDisplayed(){
        this.waitElementIsDisplayed(this.successMsg);
        return this.successMsg.isDisplayed();
    }

    public LoginScreen tapOkBtn(){
        this.waitElementIsDisplayed(this.okBtn);
        this.okBtn.click();
        return new LoginScreen(driver);
    }


    public SuccesfullyLoginScreen(AndroidDriver driver) {
        super(driver);
    }
}

package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    private static final String TITLE = "UiSelector().textContains(\"Login / Sign up Form\")";
    private static final String LOGIN_BTN = "UiSelector().textContains(\"Login\")";
    private static final String SIGNUP_BTN = "UiSelector().textContains(\"Sign up\")";
    private static final String EMAIL_TXT = "UiSelector().textContains(\"Email\")";
    private static final String PASSWORD_TXT = "UiSelector().textContains(\"Password\")";
    private static final String SEND_LOGIN_BTN = "UiSelector().className(\"android.view.ViewGroup\").instance(16)";
    private static final String FORMS_BTN = "Forms";


    @AndroidFindBy(uiAutomator = TITLE)
    private WebElement title;

    @AndroidFindBy(uiAutomator = LOGIN_BTN)
    private WebElement loginBtn;

    @AndroidFindBy(uiAutomator = SIGNUP_BTN)
    private WebElement signupBtn;

    @AndroidFindBy(uiAutomator = EMAIL_TXT)
    private WebElement emailtxt;

    @AndroidFindBy(uiAutomator = PASSWORD_TXT)
    private WebElement passwordTxt;

    @AndroidFindBy(uiAutomator = SEND_LOGIN_BTN)
    private WebElement sendLoginBtn;

    @AndroidFindBy(accessibility = FORMS_BTN)
    private WebElement formsBtn;

    public boolean titleDisplayed(){
        this.waitElementIsDisplayed(this.title);
        return this.title.isDisplayed();
    }

    public boolean loginBtnDisplayed(){
        this.waitElementIsDisplayed(this.loginBtn);
        return this.loginBtn.isDisplayed();
    }

    public boolean signinBtnDisplayed(){
        this.waitElementIsDisplayed(this.signupBtn);
        return this.signupBtn.isDisplayed();
    }

    public boolean emailtxtDisplayed(){
        this.waitElementIsDisplayed(this.emailtxt);
        return this.emailtxt.isDisplayed();
    }

    public boolean passwordTxtDisplayed(){
        this.waitElementIsDisplayed(this.passwordTxt);
        return this.passwordTxt.isDisplayed();
    }

    public boolean sendLoginBtnDisplayed(){
        this.waitElementIsDisplayed(this.sendLoginBtn);
        return this.sendLoginBtn.isDisplayed();
    }

    public FormsScreen tapFormsBtn(){
        this.waitElementIsDisplayed(this.formsBtn);
        this.formsBtn.click();
        return new FormsScreen(this.driver);
    }

    public LoginScreen(AndroidDriver driver) {
        super(driver);
    }
}

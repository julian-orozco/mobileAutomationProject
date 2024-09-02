package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebElement;

public class LoginScreen extends BaseScreen {

    private static final String TITLE = "UiSelector().textContains(\"Login / Sign up Form\")";
    private static final String LOGIN_BTN = "UiSelector().text(\"Login\")";
    private static final String SIGNUP_BTN = "UiSelector().text(\"Sign up\")";
    private static final String EMAIL_TXT = "UiSelector().textContains(\"Email\")";
    private static final String PASSWORD_TXT = "UiSelector().textContains(\"Password\")";
    private static final String SEND_LOGIN_BTN = "UiSelector().className(\"android.view.ViewGroup\").instance(16)";
    private static final String EMAIL_INPUT = "input-email";
    private static final String PASSWORD_INPUT = "input-password";
    private static final String CONF_PASS_INPUT = "UiSelector().textContains(\"Confirm password\")";
    private static final String SIGNUP_SEND_BTN = "button-SIGN UP";
    private static String email;
    private static String password;


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

    @AndroidFindBy(accessibility = EMAIL_INPUT)
    private WebElement emailInput;

    @AndroidFindBy(accessibility = PASSWORD_INPUT)
    private WebElement passwordInput;

    @AndroidFindBy(uiAutomator = CONF_PASS_INPUT)
    private WebElement confirmPassInput;

    @AndroidFindBy(accessibility = SIGNUP_SEND_BTN)
    private WebElement signupSendBtn;

    public boolean titleDisplayed(){
        this.waitElementIsDisplayed(this.title);
        return this.title.isDisplayed();
    }

    public boolean loginBtnDisplayed(){
        this.waitElementIsDisplayed(this.loginBtn);
        return this.loginBtn.isDisplayed();
    }

    public boolean signupBtnDisplayed(){
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

    public boolean confirmPassInputDisplayed(){
        this.waitElementIsDisplayed(this.confirmPassInput);
        return this.confirmPassInput.isDisplayed();
    }

    public void tapSignUpBtn(){
        this.waitElementIsDisplayed(this.signupBtn);
        this.signupBtn.click();
    }

    public void taploginBtn(){
        this.waitElementIsDisplayed(this.loginBtn);
        this.loginBtn.click();
    }

    public void enterEmail(){
        this.waitElementIsDisplayed(this.emailInput);
        this.emailInput.sendKeys(this.email);
    }

    public void enterPassword(){
        this.waitElementIsDisplayed(this.passwordInput);
        this.passwordInput.sendKeys(this.password);
    }

    public void enterConfPassword(){
        this.waitElementIsDisplayed(this.confirmPassInput);
        this.confirmPassInput.sendKeys(this.password);
    }

    public SuccesfullySignUpScreen tapSendSignUpBtn(){
        this.waitElementIsDisplayed(this.signupSendBtn);
        this.signupSendBtn.click();
        return new SuccesfullySignUpScreen(driver);
    }

    public SuccesfullyLoginScreen tapSendLoginBtn(){
        this.waitElementIsDisplayed(this.sendLoginBtn);
        this.sendLoginBtn.click();
        return new SuccesfullyLoginScreen(driver);
    }

    public String generateRandomEmail(){
        String randomString = RandomStringUtils.randomAlphanumeric(10);
        return randomString + "@mail.com";
    }

    public LoginScreen(AndroidDriver driver) {
        super(driver);
        if (LoginScreen.email == null) {
            LoginScreen.email = this.generateRandomEmail();
            LoginScreen.password = "12345678";
        }
    }
}

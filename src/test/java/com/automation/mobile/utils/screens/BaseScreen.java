package com.automation.mobile.utils.screens;

import com.automation.mobile.screens.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {
    protected AndroidDriver driver;

    protected static final String WEB_VIEW_BTN = "Webview";
    protected static final String LOGIN_BTN = "Login";
    protected static final String FORMS_BTN = "Forms";
    protected static final String SWIPE_BTN = "Swipe";
    protected static final String DRAG_BTN = "Drag";

    @AndroidFindBy(accessibility = WEB_VIEW_BTN)
    protected WebElement webViewBtn;

    @AndroidFindBy(accessibility = LOGIN_BTN)
    protected WebElement loginBtn;

    @AndroidFindBy(accessibility = FORMS_BTN)
    protected WebElement formsBtn;

    @AndroidFindBy(accessibility = SWIPE_BTN)
    protected WebElement swipeBtn;

    @AndroidFindBy(accessibility = DRAG_BTN)
    private WebElement dragBtn;

    public BaseScreen(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public WebViewScreen tapWebViewBtn(){
        this.waitElementIsDisplayed(this.webViewBtn);
        this.webViewBtn.click();
        return new WebViewScreen(this.driver);
    }

    public LoginScreen tapLoginBtn(){
        this.waitElementIsDisplayed(this.loginBtn);
        this.loginBtn.click();
        return new LoginScreen(this.driver);
    }

    public FormsScreen tapFormsBtn(){
        this.waitElementIsDisplayed(this.formsBtn);
        this.formsBtn.click();
        return new FormsScreen(this.driver);
    }

    public SwipeScreen tapSwipeBtn(){
        this.waitElementIsDisplayed(this.swipeBtn);
        this.swipeBtn.click();
        return new SwipeScreen(this.driver);
    }

    public DragScreen tapDragBtn(){
        this.waitElementIsDisplayed(this.dragBtn);
        this.dragBtn.click();
        return new DragScreen(this.driver);
    }

    protected void waitElementIsDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}

package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SwipeScreen extends BaseScreen {

    private static final String TITLE = "UiSelector().textContains(\"Swipe horizontal\")";
    private static final String SUBTITLE = "UiSelector().textContains(\"Or swipe vertical to find what I'm hiding.\")";
    private static final String GITHUB_TITLE = "UiSelector().textContains(\"FULLY OPEN SOURCE\")";
    private static final String GITHUB_TXT = "UiSelector().textContains(\"WebdriverIO is fully open source and can be found on GitHub\")";
    private static final String CARD_0 = "UiSelector().description(\"card\").instance(0)";
    private static final String DRAG_BTN = "Drag";

    @AndroidFindBy(uiAutomator = TITLE)
    private WebElement title;

    @AndroidFindBy(uiAutomator = SUBTITLE)
    private WebElement subtitle;

    @AndroidFindBy(uiAutomator = GITHUB_TITLE)
    private WebElement githubTitle;

    @AndroidFindBy(uiAutomator = GITHUB_TXT)
    private WebElement githubTxt;

    @AndroidFindBy(uiAutomator = CARD_0)
    private WebElement card0;

    @AndroidFindBy(accessibility = DRAG_BTN)
    private WebElement dragBtn;

    public boolean titleDisplayed(){
        this.waitElementIsDisplayed(this.title);
        return this.title.isDisplayed();
    }

    public boolean subtitleDisplayed(){
        this.waitElementIsDisplayed(this.subtitle);
        return this.subtitle.isDisplayed();
    }

    public boolean githubTitleDisplayed(){
        this.waitElementIsDisplayed(this.githubTitle);
        return this.githubTitle.isDisplayed();
    }

    public boolean githubTxtDisplayed(){
        this.waitElementIsDisplayed(this.githubTxt);
        return this.githubTxt.isDisplayed();
    }

    public boolean card0Displayed(){
        this.waitElementIsDisplayed(this.card0);
        return this.card0.isDisplayed();
    }


    public DragScreen tapDragBtn(){
        this.waitElementIsDisplayed(this.dragBtn);
        this.dragBtn.click();
        return new DragScreen(this.driver);
    }

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }
}

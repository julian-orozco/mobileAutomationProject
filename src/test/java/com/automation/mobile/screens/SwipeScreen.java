package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Arrays;

public class SwipeScreen extends BaseScreen {

    private static final String TITLE = "UiSelector().textContains(\"Swipe horizontal\")";
    private static final String SUBTITLE = "UiSelector().textContains(\"Or swipe vertical to find what I'm hiding.\")";
    private static final String GITHUB_TITLE = "UiSelector().textContains(\"FULLY OPEN SOURCE\")";
    private static final String GITHUB_TXT = "UiSelector().textContains(\"WebdriverIO is fully open source and can be found on GitHub\")";
    private static final String CARD_0 = "UiSelector().description(\"card\").instance(0)";
    private static final String COMMUNITY_TITLE = "UiSelector().text(\"GREAT COMMUNITY\")";
    private static final String JS_TITLE = "UiSelector().text(\"JS.FOUNDATION\")";
    private static final String YT_TITLE = "UiSelector().text(\"SUPPORT VIDEOS\")";
    private static final String EXTENDABLE_TITLE = "UiSelector().text(\"EXTENDABLE\")";
    private static final String COMPATIBLE_TITLE = "UiSelector().text(\"COMPATIBLE\")";
    private static final String YOU_FOUND_ME_TITLE = "UiSelector().text(\"You found me!!!\")";

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

    @AndroidFindBy(uiAutomator = COMMUNITY_TITLE)
    private WebElement communityTitle;

    @AndroidFindBy(uiAutomator = JS_TITLE)
    private WebElement jsTitle;

    @AndroidFindBy(uiAutomator = YT_TITLE)
    private WebElement ytTitle;

    @AndroidFindBy(uiAutomator = EXTENDABLE_TITLE)
    private WebElement extendableTitle;

    @AndroidFindBy(uiAutomator = COMPATIBLE_TITLE)
    private WebElement compatibleTitle;

    @AndroidFindBy(uiAutomator = YOU_FOUND_ME_TITLE)
    private WebElement youFoundMeTitle;

    public boolean titleDisplayed(){
        this.waitElementIsDisplayed(this.title);
        return this.title.isDisplayed();
    }

    public boolean subtitleDisplayed(){
        this.waitElementIsDisplayed(this.subtitle);
        return this.subtitle.isDisplayed();
    }

    public boolean githubTitleDisplayed(){
        try {
            return this.githubTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean githubTxtDisplayed(){
        this.waitElementIsDisplayed(this.githubTxt);
        return this.githubTxt.isDisplayed();
    }

    public boolean communityTitleDisplayed(){
        try {
            return this.communityTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean jsTitleDisplayed(){
        try {
            return this.jsTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean ytTitleDisplayed(){
        try {
            return this.ytTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean extendableTitleDisplayed(){
        try {
            return this.extendableTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean compatibleTitleDisplayed(){
        try {
            return this.compatibleTitle.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean card0Displayed(){
        this.waitElementIsDisplayed(this.card0);
        return this.card0.isDisplayed();
    }

    public boolean youFoundMeDisplayed(){
        this.waitElementIsDisplayed(this.youFoundMeTitle);
        return this.youFoundMeTitle.isDisplayed();
    }

    public void swipeGesture(int startX , int startY, int endX , int endY){
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Arrays.asList(swipe));
    }

    public SwipeScreen(AndroidDriver driver) {
        super(driver);
    }
}

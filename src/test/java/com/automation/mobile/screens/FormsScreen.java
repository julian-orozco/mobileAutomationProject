package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class FormsScreen extends BaseScreen {

    private static final String TITLE = "UiSelector().textContains(\"Form components\")";
    private static final String INPUT_TXT = "UiSelector().textContains(\"Input field:\")";
    private static final String TYPE_SOMETHING_TXT = "UiSelector().textContains(\"Type something\")";
    private static final String YOU_HAVE_TYPED_TXT = "UiSelector().textContains(\"You have typed:\")";
    private static final String HAVE_TYPED_TXT = "input-text-result";
    private static final String SWITCH_TGL = "switch";
    private static final String SELECT_ITEM_DROPDOWN = "UiSelector().textContains(\"Select an item...\")";
    private static final String ACTIVE_BTN = "UiSelector().className(\"android.view.ViewGroup\").instance(17)";
    private static final String INACTIVE_BTN = "UiSelector().className(\"android.view.ViewGroup\").instance(19)";
    private static final String SWIPE_BTN = "Swipe";

    @AndroidFindBy(uiAutomator = TITLE)
    private WebElement title;

    @AndroidFindBy(uiAutomator = INPUT_TXT)
    private WebElement inputTxt;

    @AndroidFindBy(uiAutomator = TYPE_SOMETHING_TXT)
    private WebElement typeSomethingTxt;

    @AndroidFindBy(uiAutomator = YOU_HAVE_TYPED_TXT)
    private WebElement youHaveTypedTxt;

    @AndroidFindBy(accessibility = HAVE_TYPED_TXT)
    private WebElement haveTypedTxt;

    @AndroidFindBy(accessibility = SWITCH_TGL)
    private WebElement switchTgl;

    @AndroidFindBy(uiAutomator = SELECT_ITEM_DROPDOWN)
    private WebElement selectItemDropdown;

    @AndroidFindBy(uiAutomator = ACTIVE_BTN)
    private WebElement activeBtn;

    @AndroidFindBy(uiAutomator = INACTIVE_BTN)
    private WebElement inactiveBtn;

    @AndroidFindBy(accessibility = SWIPE_BTN)
    private WebElement swipeBtn;

    public boolean titleDisplayed(){
        this.waitElementIsDisplayed(this.title);
        return this.title.isDisplayed();
    }

    public boolean inputTxtDisplayed(){
        this.waitElementIsDisplayed(this.inputTxt);
        return this.inputTxt.isDisplayed();
    }

    public boolean typeSomethingTxtDisplayed(){
        this.waitElementIsDisplayed(this.typeSomethingTxt);
        return this.typeSomethingTxt.isDisplayed();
    }

    public boolean youHaveTypedDisplayed(){
        this.waitElementIsDisplayed(this.youHaveTypedTxt);
        return this.youHaveTypedTxt.isDisplayed();
    }

    public boolean haveTypedTxtDisplayed(){
        this.waitElementIsDisplayed(this.haveTypedTxt);
        return this.haveTypedTxt.isDisplayed();
    }

    public boolean switchTglDisplayed(){
        this.waitElementIsDisplayed(this.switchTgl);
        return this.switchTgl.isDisplayed();
    }

    public boolean selectItemDropdownDisplayed(){
        this.waitElementIsDisplayed(this.selectItemDropdown);
        return this.selectItemDropdown.isDisplayed();
    }

    public boolean activeBtnDisplayed(){
        this.waitElementIsDisplayed(this.activeBtn);
        return this.activeBtn.isDisplayed();
    }

    public boolean inactiveBtnDisplayed(){
        this.waitElementIsDisplayed(this.inactiveBtn);
        return this.inactiveBtn.isDisplayed();
    }

    public SwipeScreen tapSwipeBtn(){
        this.waitElementIsDisplayed(this.swipeBtn);
        this.swipeBtn.click();
        return new SwipeScreen(this.driver);
    }

    public FormsScreen(AndroidDriver driver) {
        super(driver);
    }
}

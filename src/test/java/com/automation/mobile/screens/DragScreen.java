package com.automation.mobile.screens;

import com.automation.mobile.utils.screens.BaseScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DragScreen extends BaseScreen {

    private static final String TITLE = "UiSelector().textContains(\"Drag and Drop\")";

    private static final String DROP1 = "drop-l1";
    private static final String DROP2 = "drop-c1";
    private static final String DROP3 = "drop-r1";
    private static final String DROP4 = "drop-l2";
    private static final String DROP5 = "drop-c2";
    private static final String DROP6 = "drop-r2";
    private static final String DROP7 = "drop-l3";
    private static final String DROP8 = "drop-c3";
    private static final String DROP9 = "drop-c3";

    private static final String RENEW_BTN = "UiSelector().text(\"\uDB80\uDC6A\")";

    private static final String DRAG1 = "drag-l2";
    private static final String DRAG2 = "drag-r3";
    private static final String DRAG3 = "drag-r1";
    private static final String DRAG4 = "drag-c1";
    private static final String DRAG5 = "drag-c3";
    private static final String DRAG6 = "drag-r2";
    private static final String DRAG7 = "drag-c2";
    private static final String DRAG8 = "drag-l1";
    private static final String DRAG9 = "drag-l3";


    @AndroidFindBy(uiAutomator = TITLE)
    private WebElement title;

    @AndroidFindBy(accessibility = DROP1)
    private WebElement drop1;

    @AndroidFindBy(accessibility = DROP2)
    private WebElement drop2;

    @AndroidFindBy(accessibility = DROP3)
    private WebElement drop3;

    @AndroidFindBy(accessibility = DROP4)
    private WebElement drop4;

    @AndroidFindBy(accessibility = DROP5)
    private WebElement drop5;

    @AndroidFindBy(accessibility = DROP6)
    private WebElement drop6;

    @AndroidFindBy(accessibility = DROP7)
    private WebElement drop7;

    @AndroidFindBy(accessibility = DROP8)
    private WebElement drop8;

    @AndroidFindBy(accessibility = DROP9)
    private WebElement drop9;

    @AndroidFindBy(accessibility = DRAG1)
    private WebElement drag1;

    @AndroidFindBy(accessibility = DRAG2)
    private WebElement drag2;

    @AndroidFindBy(accessibility = DRAG3)
    private WebElement drag3;

    @AndroidFindBy(accessibility = DRAG4)
    private WebElement drag4;

    @AndroidFindBy(accessibility = DRAG5)
    private WebElement drag5;

    @AndroidFindBy(accessibility = DRAG6)
    private WebElement drag6;

    @AndroidFindBy(accessibility = DRAG7)
    private WebElement drag7;

    @AndroidFindBy(accessibility = DRAG8)
    private WebElement drag8;

    @AndroidFindBy(accessibility = DRAG9)
    private WebElement drag9;

    @AndroidFindBy(uiAutomator = RENEW_BTN)
    private WebElement revenewBn;

    public boolean titleDisplayed(){
        this.waitElementIsDisplayed(this.title);
        return this.title.isDisplayed();
    }

    public boolean drop1Displayed(){
        this.waitElementIsDisplayed(this.drop1);
        return this.drop1.isDisplayed();
    }

    public boolean drop2Displayed(){
        this.waitElementIsDisplayed(this.drop2);
        return this.drop2.isDisplayed();
    }

    public boolean drop3Displayed(){
        this.waitElementIsDisplayed(this.drop3);
        return this.drop3.isDisplayed();
    }

    public boolean drop4Displayed(){
        this.waitElementIsDisplayed(this.drop4);
        return this.drop4.isDisplayed();
    }

    public boolean drop5Displayed(){
        this.waitElementIsDisplayed(this.drop5);
        return this.drop5.isDisplayed();
    }

    public boolean drop6Displayed(){
        this.waitElementIsDisplayed(this.drop6);
        return this.drop6.isDisplayed();
    }

    public boolean drop7Displayed(){
        this.waitElementIsDisplayed(this.drop7);
        return this.drop7.isDisplayed();
    }

    public boolean drop8Displayed(){
        this.waitElementIsDisplayed(this.drop8);
        return this.drop8.isDisplayed();
    }

    public boolean drop9Displayed(){
        this.waitElementIsDisplayed(this.drop9);
        return this.drop9.isDisplayed();
    }

    public boolean drag1Displayed(){
        this.waitElementIsDisplayed(this.drag1);
        return this.drag1.isDisplayed();
    }

    public boolean drag2Displayed(){
        this.waitElementIsDisplayed(this.drag2);
        return this.drag2.isDisplayed();
    }

    public boolean drag3Displayed(){
        this.waitElementIsDisplayed(this.drag3);
        return this.drag3.isDisplayed();
    }

    public boolean drag4Displayed(){
        this.waitElementIsDisplayed(this.drag4);
        return this.drag4.isDisplayed();
    }

    public boolean drag5Displayed(){
        this.waitElementIsDisplayed(this.drag5);
        return this.drag5.isDisplayed();
    }

    public boolean drag6Displayed(){
        this.waitElementIsDisplayed(this.drag6);
        return this.drag6.isDisplayed();
    }

    public boolean drag7Displayed(){
        this.waitElementIsDisplayed(this.drag7);
        return this.drag7.isDisplayed();
    }

    public boolean drag8Displayed(){
        this.waitElementIsDisplayed(this.drag8);
        return this.drag8.isDisplayed();
    }

    public boolean drag9Displayed(){
        this.waitElementIsDisplayed(this.drag9);
        return this.drag9.isDisplayed();
    }

    public boolean revenewBnDisplayed(){
        this.waitElementIsDisplayed(this.revenewBn);
        return this.revenewBn.isDisplayed();
    }

    public DragScreen(AndroidDriver driver) {
        super(driver);
    }
}

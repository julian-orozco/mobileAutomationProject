package com.automation.mobile.test;

import com.automation.mobile.screens.*;
import com.automation.mobile.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void NavigationMenu(){
        HomeScreen homeScreen = returnHomeScreen();
        Assert.assertTrue(homeScreen.webDriverTitleDisplayed());

        WebViewScreen webViewScreen= homeScreen.tapWebViewBtn();
        Assert.assertTrue(webViewScreen.webDriverLogoDisplayed());
        Assert.assertTrue(webViewScreen.searchBtnDisplayed());
        Assert.assertTrue(webViewScreen.hamburgerBtnDisplayed());
        Assert.assertTrue(webViewScreen.maintxtDisplayed());

        LoginScreen loginScreen = webViewScreen.tapLoginBtn();
        Assert.assertTrue(loginScreen.titleDisplayed());
        Assert.assertTrue(loginScreen.loginBtnDisplayed());
        Assert.assertTrue(loginScreen.signinBtnDisplayed());
        Assert.assertTrue(loginScreen.emailtxtDisplayed());
        Assert.assertTrue(loginScreen.passwordTxtDisplayed());
        Assert.assertTrue(loginScreen.sendLoginBtnDisplayed());

        FormsScreen formsScreen = loginScreen.tapFormsBtn();
        Assert.assertTrue(formsScreen.titleDisplayed());
        Assert.assertTrue(formsScreen.inputTxtDisplayed());
        Assert.assertTrue(formsScreen.typeSomethingTxtDisplayed());
        Assert.assertTrue(formsScreen.youHaveTypedDisplayed());
        Assert.assertTrue(formsScreen.haveTypedTxtDisplayed());
        Assert.assertTrue(formsScreen.switchTglDisplayed());
        Assert.assertTrue(formsScreen.selectItemDropdownDisplayed());
        Assert.assertTrue(formsScreen.activeBtnDisplayed());
        Assert.assertTrue(formsScreen.inactiveBtnDisplayed());

        SwipeScreen swipeScreen = formsScreen.tapSwipeBtn();
        Assert.assertTrue(swipeScreen.titleDisplayed());
        Assert.assertTrue(swipeScreen.subtitleDisplayed());
        Assert.assertTrue(swipeScreen.githubTitleDisplayed());
        Assert.assertTrue(swipeScreen.githubTxtDisplayed());
        Assert.assertTrue(swipeScreen.card0Displayed());

        DragScreen dragScreen = swipeScreen.tapDragBtn();
        Assert.assertTrue(dragScreen.titleDisplayed());

        Assert.assertTrue(dragScreen.drop1Displayed());
        Assert.assertTrue(dragScreen.drop2Displayed());
        Assert.assertTrue(dragScreen.drop3Displayed());
        Assert.assertTrue(dragScreen.drop4Displayed());
        Assert.assertTrue(dragScreen.drop5Displayed());
        Assert.assertTrue(dragScreen.drop6Displayed());
        Assert.assertTrue(dragScreen.drop7Displayed());
        Assert.assertTrue(dragScreen.drop8Displayed());
        Assert.assertTrue(dragScreen.drop9Displayed());

        Assert.assertTrue(dragScreen.revenewBnDisplayed());

        Assert.assertTrue(dragScreen.drag1Displayed());
        Assert.assertTrue(dragScreen.drag2Displayed());
        Assert.assertTrue(dragScreen.drag3Displayed());
        Assert.assertTrue(dragScreen.drag4Displayed());
        Assert.assertTrue(dragScreen.drag5Displayed());
        Assert.assertTrue(dragScreen.drag6Displayed());
        Assert.assertTrue(dragScreen.drag7Displayed());
        Assert.assertTrue(dragScreen.drag8Displayed());
        Assert.assertTrue(dragScreen.drag9Displayed());

    }

}

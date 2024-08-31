package com.automation.mobile.test;

import com.automation.mobile.screens.HomeScreen;
import com.automation.mobile.screens.LoginScreen;
import com.automation.mobile.screens.WebViewScreen;
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
        LoginScreen loginScreen = webViewScreen.tapLoginBtn();
    }

}

package com.automation.mobile.test;

import com.automation.mobile.screens.HomeScreen;
import com.automation.mobile.screens.LoginScreen;
import com.automation.mobile.screens.SuccesfullySignUpScreen;
import com.automation.mobile.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTest extends BaseTest {

    @Test
    public void SignUpTest() {
        HomeScreen homeScreen = returnHomeScreen();
        LoginScreen loginScreen = homeScreen.tapLoginBtn();
        Assert.assertTrue(loginScreen.titleDisplayed());

        Assert.assertTrue(loginScreen.signupBtnDisplayed());
        loginScreen.tapSignUpBtn();
        Assert.assertTrue(loginScreen.confirmPassInputDisplayed());
        loginScreen.enterEmail();
        loginScreen.enterPassword();
        loginScreen.enterConfPassword();

        SuccesfullySignUpScreen succesfullySignUpScreen = loginScreen.tapSendSignUpBtn();
        Assert.assertTrue(succesfullySignUpScreen.successMsgDisplayed());
    }
}

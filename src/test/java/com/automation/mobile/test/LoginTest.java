package com.automation.mobile.test;

import com.automation.mobile.screens.HomeScreen;
import com.automation.mobile.screens.LoginScreen;
import com.automation.mobile.screens.SuccesfullyLoginScreen;
import com.automation.mobile.screens.SuccesfullySignUpScreen;
import com.automation.mobile.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void LoginTest() {
        //Create an account
        HomeScreen homeScreen = returnHomeScreen();
        LoginScreen loginScreen = homeScreen.tapLoginBtn();
        loginScreen.tapSignUpBtn();
        loginScreen.enterEmail();
        loginScreen.enterPassword();
        loginScreen.enterConfPassword();

        SuccesfullySignUpScreen succesfullySignUpScreen = loginScreen.tapSendSignUpBtn();
        Assert.assertTrue(succesfullySignUpScreen.successMsgDisplayed());
        loginScreen = succesfullySignUpScreen.tapOkBtn();
        loginScreen.taploginBtn();

        SuccesfullyLoginScreen succesfullyLoginScreen = loginScreen.tapSendLoginBtn();
        Assert.assertTrue(succesfullyLoginScreen.successMsgDisplayed());
        loginScreen = succesfullyLoginScreen.tapOkBtn();

    }
}

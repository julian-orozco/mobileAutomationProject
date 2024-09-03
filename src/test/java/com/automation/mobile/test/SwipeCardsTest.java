package com.automation.mobile.test;

import com.automation.mobile.screens.HomeScreen;
import com.automation.mobile.screens.SwipeScreen;
import com.automation.mobile.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwipeCardsTest extends BaseTest {

    @Test
    public void SwipeTest(){
        HomeScreen homeScreen = returnHomeScreen();
        SwipeScreen swipeScreen = homeScreen.tapSwipeBtn();
        Assert.assertTrue(swipeScreen.titleDisplayed());

        Assert.assertTrue(swipeScreen.githubTitleDisplayed());
        swipeScreen.swipeGesture(887,1594, 209, 1594);
        Assert.assertFalse(swipeScreen.githubTitleDisplayed());
        Assert.assertTrue(swipeScreen.communityTitleDisplayed());

        swipeScreen.swipeGesture(887,1594, 209, 1594);
        Assert.assertFalse(swipeScreen.communityTitleDisplayed());
        Assert.assertTrue(swipeScreen.jsTitleDisplayed());

        swipeScreen.swipeGesture(887,1594, 209, 1594);
        Assert.assertFalse(swipeScreen.jsTitleDisplayed());
        Assert.assertTrue(swipeScreen.ytTitleDisplayed());

        swipeScreen.swipeGesture(887,1594, 209, 1594);
        Assert.assertFalse(swipeScreen.ytTitleDisplayed());
        Assert.assertTrue(swipeScreen.extendableTitleDisplayed());

        swipeScreen.swipeGesture(887,1594, 209, 1594);
        Assert.assertFalse(swipeScreen.extendableTitleDisplayed());
        Assert.assertTrue(swipeScreen.compatibleTitleDisplayed());

        swipeScreen.swipeGesture(536,2101, 536, 209);
        swipeScreen.swipeGesture(536,2101, 536, 209);
        Assert.assertTrue(swipeScreen.youFoundMeDisplayed());
    }
}

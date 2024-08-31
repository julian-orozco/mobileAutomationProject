package com.automation.mobile.utils.tests;

import com.automation.mobile.screens.HomeScreen;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest {
    private static final String PROPERTIES_FILE = "src/test/resources/config.properties";
    private static final Properties properties = new Properties();
    public static AndroidDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void enviromentSetUp() {
        loadProperties();
        UiAutomator2Options capabilites = new UiAutomator2Options();
        setUpCapabilities(capabilites);

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilites);
        } catch (MalformedURLException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public void loadProperties() {
        try {
            FileInputStream fileInputStream = new FileInputStream(PROPERTIES_FILE);
            properties.load((fileInputStream));
        } catch (Exception e) {
            throw new RuntimeException("Error loading properties file " + PROPERTIES_FILE);
        }
    }

    public static void setUpCapabilities(UiAutomator2Options capabilities) {
        capabilities.setPlatformName(getCapability("platformName"));
        capabilities.setPlatformName(getCapability("deviceName"));
        capabilities.setPlatformName(getCapability("appPackage"));
        capabilities.setPlatformName(getCapability("appActivity"));

    }

    public static String getCapability(String variable) {
        return properties.getProperty(variable);
    }

    public HomeScreen returnHomeScreen(){
        return new HomeScreen(driver);
    }


}

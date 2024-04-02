package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AppiumDriver driver;

    public static void Android_setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformVersion", "12.0");
        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/ToDo_1.24_Apkpure.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
    }


    public static void tearDown(){
        if (null != driver){
            driver.quit();
        }
    }
}

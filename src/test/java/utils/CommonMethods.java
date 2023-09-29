package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import steps.PageInitializer;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonMethods extends PageInitializer {

    public static AppiumDriver driver;


    public static void launchingTheApplication() throws MalformedURLException {
        CofigReader.readProperties();
        //we need application path, where my apk file is placed
        File appDir = new File("apk");
        File app = new File(appDir, "TestApp.apk");
        //in desired capabilities, we pass all the information about device, software, version, apk etc
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
     //   capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("noReset","true");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automatorName","UIAutomator2");
        capabilities.setCapability("noSign","true");
        capabilities.setCapability("appPackage",CofigReader.getPropertyValue("appPackage"));
        capabilities.setCapability("appActivity",CofigReader.getPropertyValue("appActivity"));

        //we have appium server to connect our devices to scripts
        URL u  = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver(u, capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Application launched");
        //we are initializing all the objects from here
        initializeObject();
    }




}

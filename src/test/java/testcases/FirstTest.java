package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class FirstTest {
   public static AndroidDriver <WebElement>driver;

    @Test
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // Created object of DesiredCapabilities class.
        DesiredCapabilities capabilities = new DesiredCapabilities();
         // Set BROWSER_NAME desired capability. It's Android in our case here.
          capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        // Set android VERSION desired capability. Set your mobile device's OS version.
            capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
        // Set android platformName desired capability. It's Android in our case here.
               capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");


        driver = new AndroidDriver<WebElement>(new  URL("http://127.0.0.1:4723/wd/hub"), capabilities);
          driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.get("https://www.google.com");
              driver.findElement(By.name("q")).sendKeys("Hello Appium!!!");
        driver.quit();
    }
}

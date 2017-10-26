package testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

  public class WebApp {
	public static AndroidDriver <WebElement>driver;
	  public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  
		DesiredCapabilities capabilities= new DesiredCapabilities();
	      capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	       capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android");
	         capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
	           driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);  
              driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
         	driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Hello World");
  	     Thread.sleep(4000);
          driver.close();
            driver.quit();
              }
	        }



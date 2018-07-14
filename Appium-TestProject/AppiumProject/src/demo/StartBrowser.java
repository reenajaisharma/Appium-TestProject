package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class StartBrowser {
	
	
//	public static void main(String[] args) {
		
//	}
	@Test
	public void toStrtBrwsr() throws MalformedURLException
	{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("BROWSER_NAME", "Browser");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		
		//capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
		//capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		//System.out.println("hello");
	//	driver = new AndroidDriver(new URL(“http://127.0.0.1:4723/wd/hub&#8221;),capabilities);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,capabilities);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("http://wordpress.com");
		
		System.out.println("Title of WebPage"+driver.getTitle());
		
		//System.out.println(driver.toString());
		
		
		/*
		DesiredCapabilities capabilities=DesiredCapabilities.android();
		 
		 
		// set the capability to execute test in chrome browser
		 capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Browser");
		 
		// set the capability to execute our test in Android Platform
		   capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
		 
		// we need to define platform name
		  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 
		// Set the device name as well (you can give any name)
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"test2");
		 
		 // set the android version as well 
		   capabilities.setCapability(MobileCapabilityType.VERSION,"19");
		 
		 // Create object of URL class and specify the appium server address
		 URL url= new URL("http://127.0.0.1:4723/wd/hub");
		 
		// Create object of  AndroidDriver class and pass the url and capability that we created
		 WebDriver driver = new AndroidDriver(url, capabilities);
		 
		// Open url
		  driver.get("http://www.facebook.com");
		 */
	}

}

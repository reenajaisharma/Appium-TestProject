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

public class OpenSetting {
	
	@Test
	public void tc1() throws MalformedURLException
	{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		

		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
		
		capabilities.setCapability(MobileCapabilityType.APP_PACKAGE, "com.android.settings");
		capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url,capabilities);
		
		//to click on Display icon under Setting
		driver.findElement(By.name("Display")).click();
		
		
	}

}

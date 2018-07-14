package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calci {
	
	@Test
	public void tolaunchCalculator() throws MalformedURLException
	{
	
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("Browser");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver dr = new AndroidDriver(url,caps);
		dr.get("http://facebook.com");
		
		dr.findElement(By.name("email")).sendKeys("testUser");
		dr.findElement(By.name("pass")).sendKeys("testPass");
		
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//*[@type='submit']")).click();
	}

}

package tutorial;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchBrowser {
	
	@Test
	public void toLaunchBrowserAndGetFaceBook() throws MalformedURLException
	{
		
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setBrowserName("Browser");
		
		//set the platform_name,version and device name 
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5556");
		
		//Appium server address
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		//launch AndroidDriver
		AndroidDriver dr = new AndroidDriver(url,caps);
		
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		dr.get("http://facebook.com");
		
	}
	

		
	}



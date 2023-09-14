package mohannayak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.MutableCapabilities;


public class TestDemo {
	@Test
	public void titleCheck() throws MalformedURLException
	{
		MutableCapabilities caps = new MutableCapabilities();
		WebDriver driver= new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),caps);
		driver.get("https://rahulshettyacademy.com/");
		System.out.println("One");
		System.out.println("Two");
		System.out.println("Three");
		System.out.println("Four");
		System.out.println("Five");
		System.out.println("Six");
		
		//Assert.assertTrue(driver.getTitle().matches("currenttitle"));
		
	}
	
	

}

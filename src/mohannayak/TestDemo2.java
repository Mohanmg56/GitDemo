package mohannayak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.MutableCapabilities;


public class TestDemo2 {
	@Test
	public void titleCheck2() throws MalformedURLException
	{
		MutableCapabilities caps = new MutableCapabilities();
		WebDriver driver= new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),caps);
		driver.get("https://google.com/");
		String currenttitle=driver.getTitle();
		Assert.assertTrue(driver.getTitle().matches("currenttitle"));
		
	}
	
	

}

package org.maven;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Execution {
	public static final String USERNAME = "srinidibuelah1";
	public static final String AUTOMATE_KEY = "KssNeCpQ3eurSktEpT2c";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


@Test
public void form() throws MalformedURLException, InterruptedException  {
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setPlatform(Platform.WIN10);
	caps.setBrowserName("chrome");
	caps.setVersion("81");
	caps.setCapability("name", "Amazon app test");
	
	URL u=new URL(URL);
	
	WebDriver driver=new RemoteWebDriver(u,caps);
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	
	
	
	}

}

package Amazontest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class AmazonBase {
  @Test
  public void f() throws InterruptedException, IOException {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:/Users/puja.domke/Downloads/chromedriver_win32_new/chromedriver.exe");
		 driver = new ChromeDriver();
  
//  System.setProperty("webdriver.gecko.driver", "C:/Users/puja.domke/Documents/puja/geckodriver-v0.26.0-win64/geckodriver.exe");
//	 driver = new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
	 driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
     AmazonAction AmazonAc = new AmazonAction(driver) ;
     AmazonAc.search();
     AmazonAc.login();
     AmazonAc.takeSnapShot();
}}

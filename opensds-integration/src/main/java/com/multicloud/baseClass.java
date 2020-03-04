package com.multicloud;

import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass implements ITestListener {
	WebDriver driver;
  @Test()
  public void baseclass() throws InterruptedException {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "C:/Users/puja.domke/Downloads/chromedriver_win32_new/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://192.168.3.235:30010/");
		//driver.get("http://192.168.1.219:30010/");
	driver.manage().window().maximize();
    HomePage multi=new HomePage(driver);
    multi.Login("tester", "Newuser@123");
	 //  multi.dashboard();
    multi.storage();
  //  CreateBucket	bucket=  new  CreateBucket(driver);
   // bucket.bucket();
    Migration mg=new Migration(driver);
    mg.ImmediateMigration();
	  
	
}

@AfterMethod()
public void takescreenshot() throws IOException, InterruptedException {
	
	  Thread.sleep(3000);
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(source, new File("C:/Users/puja.domke/Screenshot/test.jpg"));
	  System.out.println("the Screenshot is taken");
	  Thread.sleep(3000);
	   
	  driver.quit();

  
  
  }}


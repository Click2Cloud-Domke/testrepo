package com.multicloud;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class CreateBucket extends baseClass{
	WebDriver driver;
	//create Bucket
	By CBucket=By.xpath("//div[@class='box12 boxClick']");
	By BucketName=By.xpath("//ng-form[@name='Pform']//input[@placeholder='Enter Bucket Name']");
	By RadioButton=By.xpath("//label[contains(text(),'Create Cloud Bucket')]");
	By cloudstorage=By.xpath("//div[@id='TAB_2']//div[2]//div[1]//div[1]//select[1]");
	By ProviderName=By.xpath("//div[@id='TAB_2']//div[3]//div[1]//div[1]//select[1]");
	By CloudBucket=By.xpath("//input[@class='form-control mg_input ng-pristine ng-valid ng-empty ng-touched']");
	By savebutton=By.xpath("//div[@id='TAB_2']//button[@class='btn mg_submit-btn-green'][contains(text(),'Save')]");
	
	public CreateBucket(WebDriver driver) {
		this.driver=driver; 
		
	}
	
	  @Test()
	  public void bucket() throws InterruptedException, IOException {
	 System.out.println("Check created smart bucket displayed on notification page");
	 driver.findElement(CBucket).click();
	 Thread.sleep(3000);
	 driver.findElement(RadioButton).click();
	 driver.findElement(BucketName).sendKeys("aws-bucket");
	WebElement Storagetype= driver.findElement(cloudstorage);
	Select select=new Select(Storagetype);
	select.selectByIndex(1);
    WebElement	providertype= driver.findElement(ProviderName);
	 Select selstorage=new Select(providertype);
	 selstorage.selectByIndex(1);
	 driver.findElement(CloudBucket).sendKeys("cloudbucket-aws");
	 driver.findElement(savebutton).click();
	 

	  Thread.sleep(3000);
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(source, new File("C:/Users/puja.domke/git/testrepo/seleniumProject/Screenshots/test.jpg"));
	  System.out.println("the Screenshot is taken");
	  Thread.sleep(3000);
	  }
	  
	  
	}

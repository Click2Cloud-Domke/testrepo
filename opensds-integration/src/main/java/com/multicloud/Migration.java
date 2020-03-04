package com.multicloud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Migration extends baseClass{
	WebDriver driver;
	By addtab=By.xpath("//div[@class='box12 boxClick migrationBox boxClick1']");
	By Create=By.xpath("//div[@class='tab_container mg_tab_container']//button[@class='btn btn_blue'][contains(text(),'Create')]");
//	By PlanName=By.xpath();
//	By SourceSmartBucket=By.xpath();
	public Migration(WebDriver driver) {
		this.driver=driver; 
		
	}
	
  @Test
  public void ImmediateMigration() {
	  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	  driver.findElement(addtab).click();
	  driver.findElement(Create).click();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}


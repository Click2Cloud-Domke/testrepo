package Amazontest;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonAction extends AmazonBase{
   WebDriver d;
 
  public void search() throws InterruptedException {
	  d.findElement(By.id("twotabsearchtextbox")).clear();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Realmi 2 pro mobile");	
		System.out.println("Search for realme 2 pro mobile");
		Thread.sleep(2000);
		
		d.findElement(By.id("issDiv2")).click();
		System.out.println("Click on second option");
		Thread.sleep(5000);
		
		
		d.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
		Thread.sleep(5000);
		System.out.println("Select mobile for add to cart");
		String parent=d.getWindowHandle();
		Set<String>s1=d.getWindowHandles();
		Iterator<String> I1= s1.iterator();
		while(I1.hasNext())
		{
		  String child_window=I1.next();
		  if(!parent.equals(child_window))
		  {
		    d.switchTo().window(child_window);
		    System.out.println(d.switchTo().window(child_window).getTitle());
		    
		  }
		}}
		
       public AmazonAction(WebDriver d) {
	      this.d = d;
	  
  }

     public void login() throws InterruptedException
  {
    		
			
			
			d.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(5000);
			System.out.println("Click on Add to Cart button");
			
			d.findElement(By.xpath("//*[@id='attach-sidesheet-view-cart-button']/span/input")).click();
			System.out.println("Click on Cart button");
			
			d.findElement(By.xpath("//*[@id='sc-buy-box-ptc-button']/span/input")).click();
			System.out.println("Click on Bye to Proceed");
			
			d.navigate().back();
			System.out.println("Navigate to back page");
			Thread.sleep(5000);
			
	  
  }
     public void takeSnapShot() throws IOException, InterruptedException {

   	  TakesScreenshot ts = (TakesScreenshot)d;
   	  File source = ts.getScreenshotAs(OutputType.FILE);
   	  FileUtils.copyFile(source, new File("C:/Users/puja.domke/eclipse-workspace/screenshot/.jpg"));
   	  System.out.println("the Screenshot is taken");
   	  Thread.sleep(3000);
   	  d.quit();

   	  }
}

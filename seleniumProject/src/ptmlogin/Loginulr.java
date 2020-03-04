package ptmlogin;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginulr extends PtmBase{
	static WebDriver d;
	By logine =By.xpath("//div[@class='_2Kbwd']");
	By logilink=By.xpath("//span[@event-category='login']");
	By user=By.xpath("//input[@name='username']");
	By pass=By.xpath("//input[@name='password']");
	By button=By.xpath("//button[@type='submit']");
	By movie=By.xpath("//input[@placeholder='Search for a Product , Brand or Category']");
	  By location=By.xpath("//a[@href='/movies/nagpur']"); 
	  By city =By.xpath("//input[@placeholder='Enter City']");

	public Loginulr(WebDriver d) {
		this.d=d; 
		

		}
	public void movie() throws InterruptedException {
		WebElement rv=d.findElement(movie);
		rv.sendKeys("movie");
		rv.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	
	WebElement	rv2=d.findElement(city);
	rv2.sendKeys("nagpur");
	WebElement rv3=d.findElement(location);
	rv3.click();
		Thread.sleep(3000);
	}
   public void loginele() {
	   d.findElement(logine).click();
	System.out.println(d.getTitle());
  }
  public void iframe() {
	  d.switchTo().frame(0);
	 }
  public void loginlink() {
	  d.findElement(By.xpath("//span[@event-category='login']")).click();
	  }
  public void user(String us) {
	  d.findElement(user).sendKeys(us);
	   }
  public void password(String ps) {
	  d.findElement(pass).sendKeys(ps);
	  }
  public void signin() {
	  d.findElement(button).click();
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


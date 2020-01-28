import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng {
	WebDriver d=null;
	
		
	
@Test()
public void test() throws InterruptedException{
	d.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Click2cloud-tester");
    d.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Click2cloud");
	d.findElement(By.xpath("//a[@id='login']")).click();
		System.out.println(d.getTitle());
		System.out.println("Login Successful");
		System.out.println(d.getTitle());
	
}
@BeforeClass()
public void login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:/Users/puja.domke/Downloads/chromedriver_win32_new/chromedriver.exe");
	 d = new ChromeDriver();
	d.get("https://click2cloud.thecloudsbrain.com/");
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
d.manage().window().maximize();
	d.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
	Thread.sleep(5000);
	
}}

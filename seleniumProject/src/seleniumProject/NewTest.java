package seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;



public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/puja.domke/Downloads/chromedriver_win32_new/chromedriver.exe");
		WebDriver d = new ChromeDriver();
	d.get("https://hello-angularjs.appspot.com/searchtable");
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
    d.manage().window().maximize();
	NgWebDriver ng=new NgWebDriver((JavascriptExecutor) d);
             ng.waitForAngularRequestsToFinish();
             d.findElement(ByAngular.model("name")).sendKeys("puja");
             d.findElement(ByAngular.model("employees")).sendKeys("puja");
             d.findElement(ByAngular.model("headoffice")).sendKeys("puja");
             d.findElement(By.xpath("//div[@class='form-group']//div//input[@class='btn btn-primary']")).click();
           
//	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
//    d.manage().window().maximize();
//	d.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
//		Thread.sleep(5000);
		
  }
}

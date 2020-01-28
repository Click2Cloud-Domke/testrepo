package Login;
import org.omg.CORBA.DynAnyPackage.Invalid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class BaseClass 
{
        
        
	WebDriver driver;
	
	@Test(dataProvider="testdata")
	public void setupApplication(String username,String password ) throws InterruptedException
	{
		
		Reporter.log("=====Browser Session Started=====", true);
		System.setProperty("webdriver.chrome.driver", "C:/Users/puja.domke/Downloads/chromedriver_win32_new/chromedriver.exe");
		
         driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://click2cloud.thecloudsbrain.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
		driver.findElement(By.xpath("//a[@id='login']")).click();
		
		Reporter.log("=====Application Started=====", true);
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] test(){
	Object[][]	ob=new Object[1][2];
	ob[0][0]="click2cloud-tester";
	ob[0][1]="Click2cloud";
	return ob;
	
	
	
		
	}
	
}
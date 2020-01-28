package seleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.internal.Systematiser;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;





public class Cloudbrain {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:/Users/puja.domke/Downloads/chromedriver_win32_new/chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("https://click2cloud.thecloudsbrain.com/");
			d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	        d.manage().window().maximize();
			d.findElement(By.xpath("//i[@class='fa fa-chevron-down']")).click();
			Thread.sleep(5000);
//			d.findElement(By.xpath("//input[@id='user_name']")).sendKeys("");
//			d.findElement(By.xpath("//input[@id='user_password']")).sendKeys("");
//			d.findElement(By.xpath("//a[@id='login']")).click();
//
//			String actualMsg = d.findElement(By.xpath("//strong[contains(text(),'Error: Name is required')]")).getText();
//			System.out.println("MSG is-"+actualMsg);
//					String errorMsg= "Error: Please enter UserName and Password";
//
//					if(actualMsg.equals(errorMsg)) {
//					        System.out.println("Test Case Passed");
//					    }else{
//					        System.out.println("Test Case Failed");
//					    }
//					Thread.sleep(5000);
//					d.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
//					d.findElement(By.xpath("//input[@id='user_password']")).sendKeys("123");
//					d.findElement(By.xpath("//a[@id='login']")).click();
//					String actualMsg2 = d.findElement(By.xpath("//strong[contains(text(),'Sorry, the username or password you entered is inc')]")).getText();
//					System.out.println("MSG is-"+actualMsg2);
//							String errorMsg2= "Sorry, the username or password you entered is incorrect.";
//
//							if(actualMsg2.equals(errorMsg2)) {
//							        System.out.println("Test Case Passed");
//							    }else{
//							        System.out.println("Test Case Failed");
//							    }
//							Thread.sleep(5000);
		d.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Click2cloud-tester");
	    d.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Click2cloud");
		d.findElement(By.xpath("//a[@id='login']")).click();
			System.out.println(d.getTitle());
			System.out.println("Login Successful");
			System.out.println(d.getTitle());
						
						d.findElement(By.xpath("//span[contains(text(),'Compute')]")).click();
						d.findElement(By.xpath("//span[contains(text(),'Clouds')]")).click();
						d.findElement(By.xpath("//li[@id='menu_item_ems_cloud']//span[@class='list-group-item-value'][contains(text(),'Providers')]")).click();
						WebElement ele=d.findElement(By.xpath("//*[@id=\"miq-gtl-view\"]/miq-tile-view/div/div/div/div[1]/div[1]/div/div/ng-switch-when/div[1]/a"));
						Actions act=new Actions(d);
					    Thread.sleep(5000);
					    act.moveToElement(ele).perform();
					WebElement checkbox  = d.findElement(By.xpath("//*[@id=\"miq-gtl-view\"]/miq-tile-view/div/div/div/div[1]/div[2]/input"));
					    checkbox.click();
					    d.findElement(By.xpath("//button[@title=\"Policy\"]")).click();
					    d.findElement(By.xpath("(//span[@class=\"ng-binding\"])[8]")).click();
					    Thread.sleep(3000);
				    d.findElement(By.xpath("//div[@class='css-zjn0y0']")).click();
					    d.findElement(By.xpath("//div[@id='tag_cat']/div[2]/div/div[22]")).click();
					    d.findElement(By.xpath("//div[@id='cat_tags_div']")).click();
				    d.findElement(By.xpath("//div[@id='cat_tags_div']/div[2]/div/div[2]")).click();
				    d.findElement(By.xpath("//button[contains(text(),'Save')] ")).click();
				    Thread.sleep(2000);
				    d.navigate().to("https://click2cloud.thecloudsbrain.com/cb_managercost/budget_management#/");
//				    d.findElement(By.xpath("//span[@class='fa fa-newspaper-o']")).click();
//				    d.findElement(By.xpath("//span[contains(text(),'Optimization')]")).click();
//				    d.findElement(By.xpath("//span[contains(text(),'Budget Management')]")).click();
				    System.out.println(d.getTitle());
					Thread.sleep(3000);
					d.findElement(By.xpath("//input[@id='datepicker']")).click();
					 d.findElement(By.xpath("//span[@class='year focused']")).click();
//						NgWebDriver ngweb=new NgWebDriver((JavascriptExecutor) d);
//						   ngweb.waitForAngularRequestsToFinish();
//						   d.findElement(ByAngular.model("datepicker")).click();
//						   d.findElement(By.xpath("//span[@class='year focused']")).click();
//						   NgWebDriver ngweb1=new NgWebDriver((JavascriptExecutor) d);
//						   ngweb1.waitForAngularRequestsToFinish();
//						   d.findElement(ByAngular.model("$parent.rad")).click();
//						   d.findElement(By.xpath("//body//div[@id='style-6']//div//div[1]//li[1]//label[1]")).click();
						   d.findElement(By.xpath("//div[contains(@class,'CustomHeightClass')]//div[3]//li[1]//label[1]")).click();
						  
							Thread.sleep(2000);
						   d.findElement(By.xpath("//input[@id='BudgetTextOct']")).sendKeys("75");
						   d.findElement(By.xpath("//input[@id='BudgetTextNov']")).sendKeys("75");
						   String oct1   =d.findElement(By.xpath("//input[@id='BudgetTextOct']")).getAttribute("value");
							System.out.println("Value of octomber"+oct1);
							String nov1  = d.findElement(By.xpath("//input[@id='BudgetTextNov']")).getAttribute("value");
							System.out.println("Value of november"+nov1);
						   
						   d.findElement(By.xpath("//button[@class='btn btn_Reset']")).click();
						   Thread.sleep(2000);
						String oct   =d.findElement(By.xpath("//input[@id='BudgetTextOct']")).getAttribute("value");
						System.out.println("Value of octomber"+oct);
						String nov  = d.findElement(By.xpath("//input[@id='BudgetTextNov']")).getAttribute("value");
						System.out.println("Value of november"+nov);
						   
								
//				   d.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[2]   ")).click();
//				   d.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/ul[1]/li[6]/div[1]/ul[1]/li[1]/a[1]/span[1]")).click();
//				   d.findElement(By.xpath("//a[contains(text(),'Storage2Cloud')] ")).click();
//				   Thread.sleep(5000);
//				   NgWebDriver ngweb2=new NgWebDriver((JavascriptExecutor) d);
//				   ngweb2.waitForAngularRequestsToFinish();
//				 
						  
}}

			
			
			
			
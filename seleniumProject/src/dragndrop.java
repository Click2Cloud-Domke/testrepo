import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/puja.domke/Downloads/chromedriver_win32_new/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/");
		driver.manage().window().maximize();
		   WebElement from = driver.findElement(By.id("draggable"));  
		   
	        //WebElement to which the above object is dropped  
	            WebElement to = driver.findElement(By.id("droppable"));  
	               
	        //Creating object of Actions class to build composite actions  
	            Actions act = new Actions(driver);  
	               
	        //Performing the drag and drop action  
	            act.dragAndDrop(from,to).build().perform();   
	            JavascriptExecutor js = (JavascriptExecutor)driver;  
	            js.executeScript("scrollBy(0, 4500)");  
	      driver.navigate().to("http://www.uitestpractice.com/Students/Switchto");
	     driver.findElement(By.xpath("//button[@id='alert']")).click();
	     Alert alert = driver.switchTo().alert();		
 		
	        // Capturing alert message.    
	        String alertMessage= driver.switchTo().alert().getText();		
	        		
	        // Displaying alert message		
	        System.out.println(alertMessage);
	        alert.accept();
	        driver.findElement(By.xpath("//button[@id='confirm']")).click();
	        driver.switchTo().alert().dismiss();
	        driver.switchTo().alert().sendKeys("Text");
	        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[3]")).click();
	       // driver.switchTo().alert().sendKeys("puja");
	      //  driver.switchTo().alert().accept();
	     
	}

}

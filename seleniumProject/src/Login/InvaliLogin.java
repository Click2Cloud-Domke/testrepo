package Login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvaliLogin extends BaseClass {
	public InvaliLogin(String string) {
		// TODO Auto-generated constructor stub
	}

	@Test(description="This TC will perform valid login")
	public void loginToApplication() throws Throwable
	{
		
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("Click2cloud-tester");
	    driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Click2cloud");
		driver.findElement(By.xpath("//a[@id='login']")).click();
		
		
		
			System.out.println(driver.getTitle());
			System.out.println("Login Successful");
			System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		Thread.sleep(5000);
	}
	
	
	
}

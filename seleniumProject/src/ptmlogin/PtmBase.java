package ptmlogin;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class PtmBase {
	WebDriver d;
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/puja.domke/Downloads/chromedriver_win32_new/chromedriver.exe");
		 d = new ChromeDriver();
		d.get("https://paytm.com/");
		d.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
        d.manage().window().maximize();
        Loginulr login = new Loginulr(d);
        login.movie();
        login.loginele();
        login.iframe();
     Thread.sleep(5000);
        login.loginlink();
        login.user("9881504049");
        login.password("pass1234");
        login.signin();
        Thread.sleep(3000);
        login.takeSnapShot();
          
  }

}


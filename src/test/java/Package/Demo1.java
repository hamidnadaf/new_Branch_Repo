package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void demo1_Test() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.facebook.com/login/");
	  Thread.sleep(3000);
	  driver.close();
  }
}

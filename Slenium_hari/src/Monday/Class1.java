package Monday;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 
{
	WebDriver driver;
	@Test
	public void test()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		
	
	}
}

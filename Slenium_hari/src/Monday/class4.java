package Monday;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class4 
{
	WebDriver driver;
	@Test
	public void test()
	{
		driver =new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		String clolor=driver.findElement(By.linkText("REGISTER")).getCssValue("font-type");
		System.out.println(clolor);
	}

}

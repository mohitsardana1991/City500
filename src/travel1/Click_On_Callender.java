package travel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Click_On_Callender{
@Test
public void test01() throws InterruptedException{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.onetravel.com/");
Thread.sleep(15000);	

	driver.findElement(By.xpath("//a [@class='signupClose icon ic-cancel-fill']")).click();
	System.out.println("Hogya");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span [@class = 'icon ic-date']")).click();
	System.out.println("Hogya ye bhi");
	driver.findElement(By.xpath("//a [@class='calendar-nav__next icon ic-arw-r']")).click();
	driver.findElement(By.xpath("//a [@class='calendar-nav__next icon ic-arw-r']")).click();
	driver.findElement(By.xpath("//a [@class='calendar-nav__next icon ic-arw-r']")).click();
	driver.findElement(By.xpath("//a [@class='calendar-nav__next icon ic-arw-r']")).click();
	
}
}

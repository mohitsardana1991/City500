package citysearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LCB {
	protected WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser){
		String projectPath = System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("firefox")){
			//Open FF
			System.setProperty("webdriver.gecko.driver", projectPath + "//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.onetravel.com/");
		}
		else if(browser.equalsIgnoreCase("chrome")){
			//Open Chrome
			System.setProperty("webdriver.chrome.driver", projectPath + "//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else{
			//Open IE
			System.setProperty("webdriver.ie.driver", projectPath + "//Drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
}

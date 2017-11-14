/*package citysearch;


//*********************************************






import java.io.File;
import java.io.FileInputStream;

import javax.print.DocFlavor.STRING;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class NewCitySEARCH {
	
private static XSSFWorkbook Webelement;
public static void main(String[] args) throws InterruptedException{




		MyMethod();

                                                                  }

		
	

	private static By selectByIndex(String string) {
		// TODO Auto-generated method stub
		return null;
	                                               }
  public static void MyMethod()
  {
	  try {
		  // Specify the path of file
		  File src=new File("C:/Users/mohit/Desktop/Top500SearchedCity.xlsx");
		 // C:\Users\mohit\Desktop
		 
		   // load file
		   FileInputStream fis=new FileInputStream(src);
		 
		   // Load workbook
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		   		   // Load sheet- Here we are loading first sheetonly
		   XSSFSheet sh1= wb.getSheetAt(0);
		   
		   WebDriver driver = new FirefoxDriver();
		 
		   driver.get("http://forerez.ae/");
			//driver.findElement(By.name("username")).sendKeys("rez21");

			 driver.findElement(By.name("txtAUserName")).sendKeys("foreit");
			System.out.println("loginid entered");
			driver.findElement(By.name("txtAPasswords")).sendKeys("Technology1!@");
		
			System.out.println("password entered");
				
			driver.findElement(By.name("btnSumitLogin")).click();
			System.out.println("Logiing You In");
		   for (int i=2;i<=503; i++)//sh1.getPhysicalNumberOfRows()
		   {   
			   sh1.getRow(i).getCell(1).setCellType(Cell.CELL_TYPE_STRING);
			   System.out.println("Mohit"+i);
			   System.out.println(sh1.getRow(i).getCell(1).getStringCellValue()+" "+sh1.getRow(i).getCell(2).getStringCellValue());
			   Thread.sleep(2000);
			   driver.findElement(By.id("txtSearch")).sendKeys(sh1.getRow(i).getCell(1).getStringCellValue());
				Thread.sleep(6000);
				driver.findElement(By.xpath("html/body/ul/li[1]/a")).click();
		driver.findElement(By.id("dt1")).click();
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/a")).click();
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/a")).click();
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/a")).click();
		driver.findElement(By.xpath("html/body/div[3]/div[2]/table/tbody/tr[4]/td[2]/a")).click();

		driver.findElement(By.id("dt2")).click();
		
		driver.findElement(By.xpath("html/body/div[3]/div[1]/table/tbody/tr[4]/td[3]/a")).click();
		driver.findElement(By.name("chkAll")).click();
		driver.findElement(By.xpath ("html/body/form/div[3]/div[3]/section/div[1]/div/div/div/div[13]/div/div[1]/div/select")).click();
		driver.findElement(By.id("ddlShowPriceCurrency")).sendKeys("USD");

		driver.findElement(By.xpath ("html/body/form/div[3]/div[3]/section/div[1]/div/div/div/div[12]/div[1]/div[6]/label/span")).click();
		driver.findElement(By.id("ddlNation")).sendKeys("Qatar");
		driver.findElement(By.name("btnSubmit")).click();
		
		Thread.sleep(30000);
		
		           driver.findElement(By.id("refine")).click();
		           System.out.println("Chal Gya");
		    
	     
		   }}
			  
		 
		  catch (Exception e) {
		 
		   System.out.println(e.getMessage());
		 
		  }
  
  }
  
		   

		   }













*/
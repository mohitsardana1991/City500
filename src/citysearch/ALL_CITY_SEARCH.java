package citysearch;

	import java.io.File;
	import java.io.FileInputStream;

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
	public class ALL_CITY_SEARCH {
		
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
			  File src=new File("C:/Users/Vinay Mahipal/Desktop/Top500SearchedCity.xlsx");
			  
			 
			   // load file
			   FileInputStream fis=new FileInputStream(src);
			 
			   // Load workbook
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   		   // Load sheet- Here we are loading first sheetonly
			   XSSFSheet sh1= wb.getSheetAt(0);
			   
			   WebDriver driver = new FirefoxDriver();
			 
			   
			   for (int i=1;i<=3; i++)//sh1.getPhysicalNumberOfRows()
			   {   
				   sh1.getRow(i).getCell(1).setCellType(Cell.CELL_TYPE_STRING);
				   System.out.println("Mohit"+i);
				   System.out.println(sh1.getRow(i).getCell(1).getStringCellValue()+" "+sh1.getRow(i).getCell(2).getStringCellValue());
				  
		            
				   
					 //driver.get("https://www.google.co.in/?gfe_rd=cr&ei=qrWEV-_HHMeL8QfBoriYCg&gws_rd=ssl");
				   String abc = driver.getCurrentUrl();	
				   if(i==1)
						{
							driver.get("http://forerez.com/");
							//driver.findElement(By.name("username")).sendKeys("rez21");

							 driver.findElement(By.name("txtAUserName")).sendKeys("msardana");
							System.out.println("loginid entered");
							driver.findElement(By.name("txtAPasswords")).sendKeys("Test@123");
						
							System.out.println("password entered");
								
							driver.findElement(By.name("btnSumitLogin")).click();
							System.out.println("Logiing You In");
						}
						//String abc = driver.getCurrentUrl();
				   else if( abc.equals("http://forerez.com/")  )
						{
							driver.findElement(By.name("txtAUserName")).sendKeys("msardana");
							System.out.println("loginid entered");
							driver.findElement(By.name("txtAPasswords")).sendKeys("Test@123");
						
							System.out.println("password entered");
								
							driver.findElement(By.name("btnSumitLogin")).click();
							System.out.println("Logiing You In");
							}
			
			
			try{
				System.out.println("mohit2."+i);
				driver.findElement(By.id("txtSearch")).sendKeys(sh1.getRow(i).getCell(1).getStringCellValue());
				Thread.sleep(6000);
				driver.findElement(By.xpath("html/body/ul/li[1]/a")).click();
			}catch(Exception e)
			{
				driver.findElement(By.xpath("html/body/form/div[3]/div[3]/section/div[1]/div/div/div/div[1]/div/div[2]/input")).clear();
				continue;
				
			}
		//	driver.findElement(By.xpath("html/body/form/div[3]/div[3]/section/div[1]/div/div/div/div[1]/div/div[2]/input")).clear();
	// need if condition here
			
			driver.findElement(By.id("txtSearch")).sendKeys(sh1.getRow(i+1).getCell(1).getStringCellValue());
			Thread.sleep(3000);
			
			
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
			String url = driver.getCurrentUrl();
			String url2= "http://forerez.ae/Hotels/CLResultPage.aspx" ;
			System.out.println(url);
			//Thread.sleep(5000);
			 for (int f=0;f<=20; f++)
			     {
				 String urlq = driver.getCurrentUrl();
				 System.out.println(urlq);
				 System.out.println(f);
				 Thread.sleep(5000);
			           if (urlq.equals(url2)){
			//Thread.sleep(45000);
			           driver.findElement(By.className("img-responsive")).click();
			           System.out.println(f);
			           System.out.println("hiiiieeee");
			           //break;
			            }
			     }
			 driver.navigate().to("http://forerez.ae/Hotels/Default.aspx"
			 		+ "");
	        // driver.findElement(By.xpath ("html/body/form/div[4]/div[2]/div/div/div[1]/a/img")).click(); 
		    // No Logo found. 
	         
	         Thread.sleep(4000);
			 
				  
			  }
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
	  }
	} 

			   













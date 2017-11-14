package citysearch;


	

	/*
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.IOException;

		import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.ss.usermodel.WorkbookFactory;
		import org.apache.poi.xssf.usermodel.XSSFSheet;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		@SuppressWarnings("unused")
		public class Sheet_Reading {
		static int rowcount=0;
		public static void main(String[] args) throws IOException, InvalidFormatException{
		FileInputStream fis=new FileInputStream("C:/Users/mohit/Desktop");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Top500SearchedCity");
		Row row=sh.getRow(2);
		Cell cell=row.getCell(1);
		System.out.println(cell);
		String cellval=cell.getStringCellValue();
		System.out.println(cellval);
		}
		}*/
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.Test;

	//C:/Users/mohit/Desktop
	
	public class Sheet_Reading {
		@Test
	 public  void testcase01(){
	  
	  try {
	  // Specify the path of file
	  File src=new File("C:/Users/Vinay Mahipal/Desktop/Top500SearchedCity.xlsx");
	 
	   // load file
	   FileInputStream fis=new FileInputStream(src);
	 
	   // Load workbook
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	   String a[]=new String[2];
	   // Load sheet- Here we are loading first sheetonly
	   XSSFSheet sh1= wb.getSheetAt(0);
	   for (int i=0;i<502; i++)
	   {   
		   System.out.println(sh1.getRow(i).getCell(1).getStringCellValue());
	   }
	 
	  } catch (Exception e) {
	 
	   //System.out.println(e.getMessage());
	 
	  }
	  
	 }
	 
	}





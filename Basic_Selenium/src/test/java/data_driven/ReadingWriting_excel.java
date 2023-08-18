package data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingWriting_excel {

	public static void main(String[] args) throws Throwable   {
		// TODO Auto-generated method stub
		 //create obj for physical file
	    FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Test_data.xlsx");
	   //load path
       Workbook wb=WorkbookFactory.create(fis);
//	    Workbook wb=WorkbookFactory.create(fis);
	    String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		String title=driver.getTitle();
		wb.getSheet("Sheet1").createRow(5).createCell(0).setCellValue(title);
		FileOutputStream fos =new FileOutputStream(".\\src\\test\\resources\\Test_data.xlsx");
	    wb.write(fos);
	}

}

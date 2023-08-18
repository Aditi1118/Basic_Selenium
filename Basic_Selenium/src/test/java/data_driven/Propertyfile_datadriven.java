package data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Propertyfile_datadriven {

	public static void main(String[] args) throws Throwable {
		
		//create obj for property class
    Properties p=new Properties();
    //create obj for physical file
    FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
    
   //load path
    p.load(fis);
    String Url= p.getProperty("url");
    String Username= p.getProperty("username");
    String Password= p.getProperty("password");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(Url);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Username);
	
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
	}

}

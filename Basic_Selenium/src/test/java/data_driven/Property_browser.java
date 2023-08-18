package data_driven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_browser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//create obj for property class
	    Properties p=new Properties();
	    //create obj for physical file
	    FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\Data.properties");
	   //load path
	    p.load(fis);
	    String Url= p.getProperty("url");
	    
	    String brow= p.getProperty("browser");
	    WebDriver driver;
	    if(brow.equals("chrome")) {
	    	WebDriverManager.chromedriver().setup();
	    	 driver=new ChromeDriver();
	    }else {
	    	WebDriverManager.firefoxdriver().setup();
	        driver=new FirefoxDriver();	    	
	    }
	    
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);

	}

}

package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame_snapdeal {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url
		driver.get("https://www.snapdeal.com/");
		 Thread.sleep(3000);
	 	 WebElement signIn=driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	     Actions a =new Actions(driver);
	     a.moveToElement(signIn).perform();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
	     Thread.sleep(3000);
	     //handeling frame through index(0 for 1st frame)
	    // driver.switchTo().frame(0);
	     //handling the frame id
	     driver.switchTo().frame("loginIframe");
	     Thread.sleep(3000);
	   //handling the frame name
	     //driver.switchTo().frame("loginIframe");
	     driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("Aditi");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
	     Thread.sleep(3000);
	     driver.switchTo().defaultContent();

	     
	}

}

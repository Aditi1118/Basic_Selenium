package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_popup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url
		driver.get("https://demoapp.skillrary.com/");
		 Thread.sleep(3000);
	 	 WebElement cources=driver.findElement(By.xpath("//a[@id='course']"));
	     Actions a =new Actions(driver);
	     a.moveToElement(cources).perform();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
	     Thread.sleep(3000);
	     Alert al= driver.switchTo().alert();
	     System.out.println(al.getText());
	     Thread.sleep(3000);
	     al.dismiss();
	     
	}

}

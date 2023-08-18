package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hidden_popup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url
		driver.get("https://www.redbus.in/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[text()='Aug']/../../../..//span[text()='18']")).click();
		 Thread.sleep(3000);
		 
	}

}

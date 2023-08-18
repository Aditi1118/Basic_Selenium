package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_locator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.facebook.com/login/");
		//xpath by attribute
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aditipatil701@gmail.com");
		//xpath contains with respect to 
         Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("123456789");
		//xpath contains with respect to text
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		driver.close();
	}

}

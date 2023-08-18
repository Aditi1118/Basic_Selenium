package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_Index {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.google.com/");
		//xpath by attribute
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("alia bhatt");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//li[@data-view-type='1'][4]")).click();
		 driver.close(); 
	}

}

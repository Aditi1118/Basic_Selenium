package webelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetching_List {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url
		driver.get("https://www.google.com/");
		
	    driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("phone");
	    Thread.sleep(3000);
		//fetching all links
		List<WebElement> list=driver.findElements(By.xpath("//li[@data-view-type='1']"));
		Thread.sleep(3000);
		for (WebElement b:list) {
			System.out.println(b.getText());
		}
		Thread.sleep(3000);
		driver.close();;
	}

}

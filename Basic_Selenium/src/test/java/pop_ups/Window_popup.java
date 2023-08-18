package pop_ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_popup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url
		driver.get("https://www.skillrary.com/");
		 Thread.sleep(3000);
		  String parent =driver.getWindowHandle();
	      driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
	      driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
	      Thread.sleep(2000);
	      Set<String> child=driver.getWindowHandles();
	      for (String b:child) {
	    	  driver.switchTo().window(b);
	      }
	      Thread.sleep(2000);
	      driver.findElement(By.id("mytext")).sendKeys("Aditi");
	      driver.switchTo().window(parent);
	      driver.quit();
	}

}

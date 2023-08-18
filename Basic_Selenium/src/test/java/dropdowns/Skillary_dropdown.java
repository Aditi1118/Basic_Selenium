package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Skillary_dropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(dropDown);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("399");
		Thread.sleep(3000);
		s.selectByVisibleText("Free ( 90 )");
		Thread.sleep(3000);
		s.selectByVisibleText("INR 100 - INR 199 ( 16 )");
		Thread.sleep(3000);
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.deselectByValue("399");
		Thread.sleep(3000);
		s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		Thread.sleep(3000);
		
		List<WebElement> ele= s.getAllSelectedOptions();
		for(WebElement ele1:ele) {
			System.out.println(ele1.getText());
		}
		Thread.sleep(3000);
		s.deselectAll();
		driver.close();
	}

}

package Scroll_bar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XY_scrolling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		WebElement career=driver.findElement(By.xpath("//a[text()='Career']"));
		Thread.sleep(3000);
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		Point point=career.getLocation();
		int x=point.getX();
		int y=point.getY();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", career);

	}

}

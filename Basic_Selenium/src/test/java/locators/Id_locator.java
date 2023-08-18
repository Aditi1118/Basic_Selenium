package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Id_locator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//open url
driver.get("https://www.facebook.com/login/");
//fetching address of email text field
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dress");
//driver.findElement(By.id("nav-search-submit-text")).click();
//Scroll window
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("window.scrollBy(0,5000)");

driver.findElement(By.id("email")).sendKeys("aditi");
driver.findElement(By.name("pass")).sendKeys("aditi@1106");
//adress of link 
//driver.findElement(By.linkText("Forgotten account?")).click();
//partial link
driver.findElement(By.partialLinkText("forgotten")).click();
Thread.sleep(5000);
driver.quit();
	}

}

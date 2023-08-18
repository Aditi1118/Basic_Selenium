package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tagname_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open url
		driver.get("https://www.amazon.in/");
		//fetching all links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for (WebElement allLinks:links) {
			System.out.println(allLinks.getText());
		}
		
	}

}

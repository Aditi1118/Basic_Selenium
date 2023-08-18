package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_dropdown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open url
		driver.get("https://www.amazon.in/");
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select(dropDown);
		s.selectByIndex(6);
		Thread.sleep(3000);
		s.selectByValue("search-alias=stripbooks");
		Thread.sleep(3000);
		s.selectByVisibleText("Clothing & Accessories");
		
		System.out.println(s.isMultiple());
		List<WebElement> value= s.getOptions();
		//System.out.println(s.Size());
		for(WebElement b:value) {
			System.out.println(b.getText());
		}
		driver.close();
		}
}
		
	



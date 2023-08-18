package Basic_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_page {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();   
		//opening empty browser
		WebDriver driver =new ChromeDriver();   
		//maximize window
	    driver.manage().window().maximize();
		//open url
		driver.get("https://www.facebook.com/login/");
		//printing title
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//closing the window
		driver.close();
	}

}

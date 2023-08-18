package Basic_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation_program {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
//navigating to another url
driver.navigate().to("https://www.amazon.in/");
Thread.sleep(5000);
driver.get("https://www.instagram.com/?__coig_restricted=1");
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().forward();
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.close();
	}

}

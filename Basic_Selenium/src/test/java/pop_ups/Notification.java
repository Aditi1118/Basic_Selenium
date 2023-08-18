package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/Users/lenovopc/Desktop/driver/geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		//options.setProfile(new FirefoxProfile());
		options.addPreference("dom.webnotifications.enabled", false);

		WebDriver driver = new FirefoxDriver(options);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.quikr.com/");
	}

}

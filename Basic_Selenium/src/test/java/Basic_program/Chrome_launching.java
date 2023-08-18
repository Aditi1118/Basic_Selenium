package Basic_program;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.WebDriverManager;
public class Chrome_launching {

	public static void main(String[] args) {	
		//ChromeDriver Driver=new ChromeDriver();
		//io.github.bonigarcia.wdm.WebDriverManager.chromedriver();
	    WebDriverManager.chromedriver().setup();     //manage chrome driver
	    
	    ChromeDriver driver =new ChromeDriver();     //opening chrome Driver
	}

}

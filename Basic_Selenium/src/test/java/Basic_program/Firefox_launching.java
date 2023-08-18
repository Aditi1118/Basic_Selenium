package Basic_program;

import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox_launching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.firefoxdriver().setup();     //manage chrome driver		    
		    FirefoxDriver driver =new FirefoxDriver();  
	}

}

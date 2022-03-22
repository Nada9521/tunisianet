package tunisanetsite;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mere {
	
		
		WebDriver driver;
		 
		@Before
		
		public void  start (){
			
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		}
		
		//Quit Driver
		@After
		public void go(){
	    driver.quit();
		}
}

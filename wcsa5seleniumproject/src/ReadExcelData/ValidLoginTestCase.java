package ReadExcelData;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     	driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	driver.get("");
     	
		
		
		
		
		
	

	}

}

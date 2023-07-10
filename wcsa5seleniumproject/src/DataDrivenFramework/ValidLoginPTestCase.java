package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginPTestCase {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
     	driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	driver.get("http://laptop-4137t40d/login.do");
     	
     	//read the data from excel file and test the loginpage
     	Flib flib = new Flib();
     	String validUsername = flib.readExceldata("./data/ActiTimeTestData.xlsx","validcreds",1,0);
     	String validPassword = flib.readExceldata("./data/ActiTimeTestData.xlsx","validcreds", 1, 1);
     	
     	driver.findElement(By.name("Username")).sendKeys(validUsername);
     	driver.findElement(By.name("pwd")).sendKeys(validPassword);
     	driver.findElement(By.name("loginButton")).click();
     	
     	
     	
		
	}

}

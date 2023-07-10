package methodsofWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

		        public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize(); 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("http://laptop-4137t40d/login.do");
				
				WebElement checkBox = driver.findElement(By.name("remenber"));
				boolean verify = checkBox.isSelected();
				System.out.println(verify);
				
				Thread.sleep(1000);
				checkBox.click();
				Thread.sleep(1000);
				boolean verify1 = checkBox.isSelected();
				System.out.println(verify1);
				
		
				
				
				
				

	}

}

package robotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot4 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
     	WebDriver driver=new ChromeDriver();
     	driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     	driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIzc_N0ubJ_wIVSnErCh3LhQGuEAAYASAAEgKJqvD_BwE");
     	driver.findElement(By.xpath("//a[text()='Watch Jewellery  ']")).click();
     	
     	Robot robot = new Robot();
     	robot.keyPress(KeyEvent.VK_COPY);
     	driver.findElement(By.xpath(""));
     	robot.keyRelease(KeyEvent.VK_PASTE);
     	
	}

}

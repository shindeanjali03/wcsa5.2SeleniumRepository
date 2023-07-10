package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Ashish%20Shinde/Desktop/wcsa5/multiselectdropdown1.html");
		
		WebElement multiselect = driver.findElement(By.id("i1"));
		
		Select sel = new Select(multiselect);
		
//		sel.selectByIndex(6);
//		
//		Thread.sleep(2000);
//		
//		//deselect by indexValue
//		sel.deselectByIndex(6);
//		Thread.sleep(2000);
//		
//		sel.selectByValue("v5");
//		Thread.sleep(2000);
//		
//		//deselect by Value
//		sel.deselectByValue("v5");
//		Thread.sleep(2000);
//		
//		
//		sel.selectByVisibleText("pav");
//		Thread.sleep(2000);
//		//deselect by visibleText
//		sel.deselectByVisibleText("pav");
//		
		
		
		for(int i=0; i<5; i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		Thread.sleep(2000);
		sel.deselectAll();
	}

}

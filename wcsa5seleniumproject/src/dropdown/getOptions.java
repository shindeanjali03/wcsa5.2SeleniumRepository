package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Ashish%20Shinde/Desktop/wcsa5/multiselectdropdown1.html");
		
		WebElement multiselect = driver.findElement(By.id("i1"));
		
		Select sel = new Select(multiselect);
		List<WebElement> opts = sel.getOptions();
		
		for(WebElement abc:opts)
		{
			Thread.sleep(1000);
			String value = abc.getText();
			
			System.out.println(value);
		}
	}

}

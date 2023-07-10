package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Ashish%20Shinde/Desktop/wcsa5/multiselectdropdown1.html");
		
		WebElement multiselect = driver.findElement(By.id("i1"));
		
		Select sel = new Select(multiselect);
		
		for(int i=2; i<=6; i++)
		{
			sel.selectByIndex(i);
		}
		
		WebElement opts = sel.getFirstSelectedOption();
		
		System.out.println("first selected option:"+opts.getText());
	}

}

package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Ashish%20Shinde/Desktop/wcsa5/multiselectdropdown1.html");
		
		WebElement multiselect = driver.findElement(By.id("i1"));
		
		
		 Select sel = new Select(multiselect);
		 
		 for(int i=2;i<=7; i++) 
		 {
		 sel.selectByIndex(i);
		 }
		 List<WebElement> options = sel.getAllSelectedOptions();
		 
		 for(WebElement value:options)
		 {
			 System.out.println(value.getText()); 
		 }
	
		 
		

	}

}

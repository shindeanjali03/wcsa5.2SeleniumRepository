package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("file:///C:/Users/HP/OneDrive/Desktop/wcsa5/SampleLogin.html");
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("input")).sendKeys("admin"); //usewrname
		
		driver.findElement(By.tagName("input")).sendKeys("manager"); //password
		

	}

}
package xpathLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./divers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("\"https://twitter.com/i/flow/login");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Text']")).sendKeys("shindeanjali0301@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[Text()=;Next']")).click();

	}

}


       

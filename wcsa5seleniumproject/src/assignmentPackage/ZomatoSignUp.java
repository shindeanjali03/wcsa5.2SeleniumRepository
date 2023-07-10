package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoSignUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //maximize the web browser
		driver.get("https://www.zomato.com/india");
		
		//to Click on sign up link
		driver.findElement(By.linkText("Sign_up")).click();
		driver.findElement(By.className("sc-1yzxt5f-9 bbrwhB")).sendKeys("AnushkaSayare");
		
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("anushkasayare@gmail.com");

	}

}
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3Locators {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Divya");
		Thread.sleep(2000);
		
		driver.findElement(By.id("LastName")).sendKeys("H");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("divyaharti19@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys("demo@shop789");
		Thread.sleep(2000);
	
		driver.findElement(By.id("ConfirmPassword")).sendKeys("demo@shop789");
		Thread.sleep(2000);
		
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		
		driver.get("https://demowebshop.tricentis.com/registerresult/1");
		driver.findElement(By.className("button-1 register-continue-button")).click();

	}

}

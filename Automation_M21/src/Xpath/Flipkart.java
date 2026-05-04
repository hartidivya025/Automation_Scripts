package Xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("phone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Bank Offer']")).click();
		Set<String> allWinIds = driver.getWindowHandles();
		for(String id : allWinIds)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			
		
			if (url.contains("https://www.flipkart.com/motorola-g57-power-5g-pantone-corsair-128"))
				driver.findElement(By.xpath("(//div[text() = '₹14,999'])")).click();
				
		}
		
	}

}

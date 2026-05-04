package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByContains {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		driver.findElement(By.xpath("//input[contains(@ title,'Search for Products')]")).sendKeys("Lpatop");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		 driver.findElement(By.xpath("//div[contains(text(),' Demo Web Shop. All rights reserved')]"));
	}

}

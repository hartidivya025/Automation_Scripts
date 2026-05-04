package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input[contains(@ title,'Search for Products')]")).sendKeys("iphone17");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Bank Offer')]")).click();
		
	
		        // Handle multiple windows
		        Set<String> ids = driver.getWindowHandles();

		        for (String id : ids) {
		            driver.switchTo().window(id);
		        }

		        // Get price
		        String price = driver.findElement(
		                By.xpath("//div[contains(text(),'₹')]")
		        ).getText();

		        System.out.println(price);
	}
}


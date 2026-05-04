package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeys {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
		
		driver.get("https://www.zomato.com/bangalore/restaurants");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("Chicken curry",Keys.ENTER);
				
	}

}

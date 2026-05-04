package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWindowHandales {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/52");
		
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Thread.sleep(5000);
		
		Set<String> allwinIds = driver.getWindowHandles();
		for(String id:allwinIds) {
			System.out.println(id);
		}
	}

}

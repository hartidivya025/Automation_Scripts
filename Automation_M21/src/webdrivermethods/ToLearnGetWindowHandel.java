package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandel {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.id("compare")).click();
		
		String windowId = driver.getWindowHandle();
		
		System.out.println(windowId);
	}
}

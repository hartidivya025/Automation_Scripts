package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		
		driver.findElement(By.id("name")).sendKeys("Divya");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("divayharti19@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("qspidDemoApp@098");
	}

}

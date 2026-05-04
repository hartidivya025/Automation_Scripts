package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		
		
		driver.findElement(By.xpath("//Input[@placeholder='Leaving From']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//Input[@placeholder='Going To']")).sendKeys("Gadag");
		driver.findElement(By.xpath("//span[@Search]")).click();
		
	}

}

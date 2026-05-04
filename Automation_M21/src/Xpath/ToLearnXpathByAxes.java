package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/reserve.php");
		
		String price = driver.findElement(By.xpath("//td[text()='United Airlines']/following-sibling::td[3]")).getText();
		
		System.out.println(price);
		
		
		driver.findElement(By.xpath("//td[text()='United Airlines']/preceding-sibling::td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}

}


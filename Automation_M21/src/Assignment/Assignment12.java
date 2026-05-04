package Assignment;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment12 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		WebElement ele = driver.findElement(By.id("select-multiple-native"));
		Select s1 = new Select(ele);
		s1.selectByVisibleText("John Hardy Women's L...");
		s1.selectByVisibleText("Solid Gold Petite Mi...");
		s1.selectByVisibleText("Samsung 49-Inch CHG9...");
		s1.selectByVisibleText("DANVOUY Womens T Shi...");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Search With Select']")).click();
		
		 WebElement ele2 = driver.findElement(By.xpath("//div[text()='Select Gender']"));
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='female'", ele2);
	}

}

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		Dimension size = driver.findElement(By.xpath("(//input[@name='q'])[1]")).getSize();
		System.out.println("Hight is " +size.getHeight());
		System.out.println("Width is " +size.getWidth());
		
		WebElement search = driver.findElement(By.xpath("(//input[@name='q'])[1]"));
		String text = search.getAttribute("placeholder");
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = 'Login']")).click();		
		
		String property = driver.findElement(By.xpath("//button[text() = 'Request OTP']")).getCssValue("background");
		System.out.println(property);
		
	}

}

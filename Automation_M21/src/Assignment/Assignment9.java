package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		String message = driver.findElement(By.xpath("//span[text()= 'Login was unsuccessful. Please correct the errors and try again.']")).getText();
		System.out.println(message);
		
		String message1 = driver.findElement(By.xpath("//li[text() = 'No customer account found']")).getText();
		System.out.println(message1);
	}

}

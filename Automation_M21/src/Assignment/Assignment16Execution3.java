package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment16Execution3 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/");
		
		driver.findElement(By.xpath("(//a[text()='Forecast Maps'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Go to map'])[1]")).click();
		WebElement FRAME = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-')]"));
		driver.switchTo().frame(FRAME);
		driver.findElement(By.id("montana")).click();
	}

}

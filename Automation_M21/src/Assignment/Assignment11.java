package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment11 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		
		WebElement element = driver.findElement(By.xpath("//a[text()=' Contact Us ']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false )", element);
		
		driver.findElement(By.xpath("//a[text()=' Contact Us ']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("987654321");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//div[text()='CONTINUE']")).click();
		Thread.sleep(10000);
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File prem = new File("./Screenshort/Myntra.png");
		FileHandler.copy(temp, prem);
		
		driver.navigate().back();
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false)", ele);
		String address = driver.findElement(By.xpath("//p[contains(text(),'Registered Office Address ')]/..//div[contains(text(),'Buildings Alyssa, ')]")).getText();
		System.out.println(address);

	}

}

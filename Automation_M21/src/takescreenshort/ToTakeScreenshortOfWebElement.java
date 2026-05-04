package takescreenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshortOfWebElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.className("header-logo"));
		
		File temp = ele.getScreenshotAs(OutputType.FILE);
		
		File prem = new File("./Screenshort/image.png");
		
		FileHandler.copy(temp, prem);
		
	}

}

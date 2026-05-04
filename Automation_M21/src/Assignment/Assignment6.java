package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computers");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.navigate().to("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//main[@data-aos='zoom-in']")).click();
		driver.findElement(By.xpath("//section[text()='X Path']")).click();
		driver.findElement(By.xpath("//section[text()='Login 1.0']")).click();
		
		
	}

}

package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAsserts {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "Welcome is not displayed");
		Reporter.log("Welcome",true);
		
		driver.findElement(By.linkText("Log in")).click();
		
		boolean status = driver.findElement(By.xpath("//input[@value='Log in']")).isDisplayed();
		Assert.assertEquals(status, true);
		
		driver.findElement(By.id("Email")).sendKeys("hartidivya@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("demoWEBshop@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}

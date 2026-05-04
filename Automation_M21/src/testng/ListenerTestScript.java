package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class ListenerTestScript extends Baseclass{
	@Test
	public void login() {
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("hartidivya@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("demoWEBshop@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo", "Home page is not displayed");
		Reporter.log("Home page is displayed",true);
	}

}

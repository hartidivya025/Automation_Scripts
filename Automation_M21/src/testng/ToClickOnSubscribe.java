package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnSubscribe extends Baseclass {
	
	@Test
	public void clickonsubscribe() {
		driver.findElement(By.id("newsletter-email")).sendKeys("hartidivya@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'newsletter-subscribe-button')]")).click();
		Reporter.log("Subscribe is sucessfully done",true);
		
	}

}

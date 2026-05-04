package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToSendValueInsearch extends Baseclass {
	@Test
	public void togettext() {
		driver.findElement(By.name("q")).sendKeys("phone");
		Reporter.log("Phone value is sent",true);
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
}
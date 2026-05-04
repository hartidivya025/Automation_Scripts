package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToClickOnBook extends Baseclass {
	
	@Test
	public void clickonBooks() {
		driver.findElement(By.linkText("Books")).click();
		Reporter.log("Book page is displayed",true);
	}

}

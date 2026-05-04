package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class AddProductToCart extends Baseclass {
	@Test
	public void Addproducttocart() {
		driver.findElement(By.linkText("Jewelry")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'add-to-cart-button-71')]")).click();
		
		
	}

}

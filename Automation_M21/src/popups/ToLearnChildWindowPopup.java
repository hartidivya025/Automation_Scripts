package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnChildWindowPopup {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/52");
		Thread.sleep(10000);
		
		driver.findElement(By.id("compare")).click();
		Set<String> allIds = driver.getWindowHandles();
		for(String s : allIds) {
			driver.switchTo().window(s);
			driver.close();
		}
	}

}

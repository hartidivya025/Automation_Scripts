package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Dimension size = driver.findElement(By.xpath("//img[@class='nivo-main-image']")).getSize();
		System.out.println("Hight is " +size.getHeight());
		System.out.println("width is " +size.getWidth());
		
	}

}

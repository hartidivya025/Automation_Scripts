package windowmethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
	}
}

package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1RedBus {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		String url = driver.getCurrentUrl();
		if (url.equals("https://www.redbus.in/"))
			System.out.println("Welcome page is displayed");
		else
			System.out.println("Welcome page is not displayed");
		
		driver.quit();
	}

}

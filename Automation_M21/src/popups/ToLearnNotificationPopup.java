package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLearnNotificationPopup {
	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();//create chromeoption object 
		opt.addArguments("--disable-notifications");//call the method
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.rediff.com/");
	}

}

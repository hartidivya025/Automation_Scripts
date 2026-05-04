package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchSamsung {
	public class ToLaunchiphone {
		@Test(groups = "Regression")
		public void Launch() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.samsung.com/in/smartphones/all-smartphones/");
		Reporter.log("Samsung phone is launched",true);
		}
	}
}
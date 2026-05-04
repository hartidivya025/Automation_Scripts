package takescreenshort;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshortOfWebpage {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(5000);
		 
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 
		 File temp = ts.getScreenshotAs(OutputType.FILE);
		 
		File prem = new File("./Screenshort/"+timestamp+".png");
		 
		FileHandler.copy(temp, prem);
	}

}

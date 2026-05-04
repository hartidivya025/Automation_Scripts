package popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadpopus {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		File f = new File("C:\\Users\\hp\\Desktop\\Divya_Harti_.pdf");
		String absolutepath = f.getAbsolutePath();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absolutepath);
		
	
	}

}



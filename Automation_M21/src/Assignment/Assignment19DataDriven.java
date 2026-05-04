package Assignment;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import takescreenshort.ToTakeScreenshortOfWebElement;

public class Assignment19DataDriven {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fil = new FileInputStream("./TestData/fresherworld.properties");
		Properties prop = new Properties();
		prop.load(fil);
		
		String url = prop.getProperty("url");
		String name = prop.getProperty("Name");
		String email = prop.getProperty("Email");	
		String mno = prop.getProperty("Mobile");
		String age = prop.getProperty("Age");
	
		driver.get(url);
		driver.findElement(By.linkText("REGISTER NOW")).click();
		driver.findElement(By.id("firstname")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("mobile")).sendKeys(mno);
		driver.findElement(By.id("datepicker")).sendKeys(age);
		
		WebElement qualification = driver.findElement(By.id("course"));
		Select s = new Select(qualification);
		s.selectByVisibleText("BE/B.Tech");
		
		driver.findElement(By.id("hasWorkExp0")).click();
		
		File f = new File("C:\\Users\\hp\\Desktop\\Divya_Harti_.pdf");
		String absolute = f.getAbsolutePath();	
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absolute);
		
		driver.findElement(By.xpath("//div[text()= ' Allow Freshersworld to send notifications ']/..//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(".Screenshorts/fresherworld.png");
		org.openqa.selenium.io.FileHandler.copy(temp, perm);
	}

}

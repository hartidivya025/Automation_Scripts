package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterFromProperties {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fil = new FileInputStream("./TestData/commondata.properties");
		Properties prop = new Properties();
		prop.load(fil);
		
		String url = prop.getProperty("url");
		String first = prop.getProperty("Firstname");
		String last = prop.getProperty("Lastname");
		String email = prop.getProperty("Email");
		String pass = prop.getProperty("password");
		String conpass = prop.getProperty("confirmpassword");
		
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("gender-female")).click();
		
		driver.findElement(By.id("FirstName")).sendKeys(first);
		driver.findElement(By.id("LastName")).sendKeys(last);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conpass);
		driver.findElement(By.id("register-button")).click();
		
		
	}

}

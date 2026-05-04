package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnHandlingDisabledElement {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		WebElement nameTF = driver.findElement(By.id("name"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('Disabled')", nameTF);//using removeAttribute('disable')
		nameTF.sendKeys("Divya");
		
		WebElement emailTF = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].value='divyaharti@gmail.com'",emailTF);//using value = 'data'
	}

}

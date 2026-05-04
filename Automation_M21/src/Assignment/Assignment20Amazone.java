package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment20Amazone {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone17");
		driver.findElement(By.id("nav-search-submit-button")).click(); 
		List<WebElement> name = driver.findElements(By.xpath("//span[contains(text(),'iPhone')]"));
		for (WebElement phone : name) {
			System.out.println(phone.getText());
		}
	}

}

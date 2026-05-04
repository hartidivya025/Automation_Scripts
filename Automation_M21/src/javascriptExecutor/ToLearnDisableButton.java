package javascriptExecutor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnDisableButton {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/checkbox/disabled?sublist=2");
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement check:checkbox) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].removeAttribute('disabled')", checkbox);
			check.click();
		}
		//js.executeScript("arguments[0].click()", checkbox);
		//js.executeScript("arguments[0].removeAttribute('disable')", checkbox);
		//checkbox.click();
	}
}

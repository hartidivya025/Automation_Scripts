package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement source = driver.findElement(By.xpath("(//h5[@class='ui-widget-header'])[1]"));
		driver.switchTo().frame(source);
		
		WebElement target = driver.findElement(By.xpath("//span[text()='Trash']"));
		driver.switchTo().frame(target);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

}

package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TestScript1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/");
		
		//mouse hover to "Testr's Hub"
		Actions act = new Actions(driver);
		WebElement mouse = driver.findElement(By.xpath("(//a[text()='Tester’s Hub'])[1]"));
		act.moveToElement(mouse).perform();
		
		//mouse hover to "Demo Testing Site"
		WebElement mouse1 = driver.findElement(By.xpath("//span[text()='Demo Testing Site']"));
		act.moveToElement(mouse1).perform();
		
		//click on "Drag and Drop
		driver.findElement(By.xpath("//span[text()='Drag And Drop']")).click();
	
		//Drag and drop
		//WebElement drag = driver.findElement(By.xpath("//img[contains(@alt,'The peaks of High Tatras')]"));
		//driver.switchTo().frame(drag);
		//WebElement drop = driver.findElement(By.xpath("//h4[@class='ui-widget-header']"));
		//driver.switchTo().frame(drop);
		//Actions act1 = new Actions(driver);
		//act.dragAndDrop(drag,drop).perform();
		

		//click on "Cheat sheet"
		driver.findElement(By.xpath("(//a[text()='CheatSheets'])[1]")).click();
		
		driver.findElement(By.xpath("//div[text()='Close']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scroll = driver.findElement(By.xpath("//a[text()='GIT Cheat Sheet']"));
		js.executeScript("arguments[0].scrollToView(true)",scroll);
		
		//click on "SQL Cheat Sheet"
		driver.findElement(By.xpath("//a[text()='SQL Cheat Sheet']")).click();
		
		
		WebElement scroll1 = driver.findElement(By.xpath("(//ul[contains(@class,'wp-block-jetpack')])[2]"));
		js.executeScript("arguments[0].scrollToView(true)", scroll1);
		
		
		WebElement timestamp = driver.findElement(By.xpath("(//img[@decoding='async'])[6]"));
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File prem = new File("./Screenshort/"+timestamp+".png");
		FileHandler.copy(temp, prem);
		
	}

}

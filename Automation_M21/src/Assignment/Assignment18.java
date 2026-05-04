package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment18 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
		
		WebElement route = driver.findElement(By.xpath("(//div[text()='Bangalore '])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", route);
		
		//clicking on route bus
		driver.findElement(By.xpath("(//div[text()='Bangalore '])[1]/..//a[text()='View Buses']")).click();
		
		WebElement partner = driver.findElement(By.xpath("//span[text()='Bus Partner']"));
		js.executeScript("arguments[0].scrollIntoView(true)", partner);
		partner.click();
		
		driver.findElement(By.xpath("//label[text()='BigBus']/..//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		
		WebElement busname = driver.findElement(By.xpath("//h5[@class='title']/../..//div[@class='operator-info col']"));
		
		
		//for(int i=0; i<busname; i++) {
			//String bs = busname.getText();
	}
}

package Assignment;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment17Execution4 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']"));
		js.executeScript("arguments[0].scrollIntoView(false)", scroll);
		
		driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
		
		WebElement amount = driver.findElement(By.xpath("//input[@formcontrolname='cdAmount']"));
		amount.clear();
		amount.sendKeys("60,0000");
		
		WebElement months = driver.findElement(By.xpath("//input[@formcontrolname='cdLength']"));
		months.clear();
		months.sendKeys("36");
		
		WebElement APY = driver.findElement(By.xpath("//input[@formcontrolname='cdRate']"));
		APY.clear();
		APY.sendKeys("12");   
		
		WebElement Compounding = driver.findElement(By.xpath("//div[@class='mat-mdc-select-value']"));
		Select s = new Select(Compounding);
		s.selectByVisibleText("mdc-list-item__primary-text");
		
		
	}

}

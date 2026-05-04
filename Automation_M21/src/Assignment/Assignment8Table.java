package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8Table {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/laptop.html");
		
		 String laptop = driver.findElement(By.xpath("//td[text() = 'HP']")).getText();
		 System.out.println("Laptop Brand: " +laptop);
		 
		 String brand = driver.findElement(By.xpath("//td[text() = 'HP']/following-sibling::td[1]")).getText();
		 System.out.println("Brand: "+brand);
		
	}

}

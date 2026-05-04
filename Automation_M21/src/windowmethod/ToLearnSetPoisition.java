package windowmethod;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetPoisition {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		driver.manage().window().setPosition(new org.openqa.selenium.Point(600, 700));	
		
		driver.quit();
	}

}

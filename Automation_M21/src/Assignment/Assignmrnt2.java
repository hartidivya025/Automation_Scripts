package Assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmrnt2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/52");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.id("compare")).click();
		
		driver.get("https://www.flipkart.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.flipkart.com/"))
			System.out.println("Welcome page is displayed");
		else
			System.out.println("Welcome page is not displayed");
		
		Thread.sleep(5000);
		
		driver.get("https://www.amazon.in/");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Amazon Hight:  "+size.getHeight());
		System.out.println("amazon width "+size.getWidth());
		
		
		Thread.sleep(5000);
		
		driver.get("https://www.ebay.com/");
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		driver.manage().window().setSize(new Dimension(600,800));
		
		Thread.sleep(5000);
		
		driver.quit();
		
		}
	}


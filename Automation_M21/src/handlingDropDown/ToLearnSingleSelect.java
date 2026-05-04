package handlingDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		
		WebElement d = driver.findElement(By.id("select3"));
		Select s = new Select(d);
		//s.selectByIndex(1);
		//s.selectByValue("India");
		s.selectByVisibleText("India");
		
		List<WebElement> alloptions = s.getOptions();
		for(WebElement ele : alloptions) {
			System.out.println(ele.getText());
		}
		
		System.out.println();
		
		
		WebElement state = driver.findElement(By.id("select5"));
		Select st = new Select(state);
		st.selectByVisibleText("Karnataka");
		List<WebElement> alloptionss = st.getOptions();
		for(WebElement ss : alloptionss ) {
			System.out.println(ss.getText());
		}
	}
}
		
		//WebElement city = driver.findElement(By.xpath("(//select[contains(@class,'placeholder-blue')])[4]"));
		//Select c = new Select(city);
		//c.selectByVisibleText("Gadag");
		//List<WebElement> alloptionscc = c.getOptions();
		//for(WebElement ct : alloptionscc) {
			//System.out.println(ct);
		//}
		
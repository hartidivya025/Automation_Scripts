package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepository.Loginpage;
import objectRepository.Welcomepage;

public class Baseclass {
	public static WebDriver driver;
	
	public Javautility jutil = new Javautility();
	public Webdriverutility wutil = new Webdriverutility();
	public Fileutility futil = new Fileutility();
	public Excelutility eutil = new Excelutility();
	
	
	@BeforeClass
	public void openBrowser() {
		driver = new ChromeDriver();
		wutil.maximize(driver);
		driver.get(futil.getDataFromProperty("url"));
		
	}
	
	@BeforeMethod
	public void login () {
		Welcomepage wp = new Welcomepage(driver);
		wp.getLoginlink().click();
		
		Loginpage lp = new Loginpage(driver);
		lp.getEmailTextField().sen
	}
	

}

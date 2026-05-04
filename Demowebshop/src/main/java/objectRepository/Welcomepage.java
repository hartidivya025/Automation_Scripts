package objectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Welcomepage {
	
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
		@FindBy(linkText = "Log in")
		private WebElement loginlink;
		
		public Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		public Object geRegisterLink() {
			return registerlink;
		}
		
		public Object getLoginlink() {
			return loginlink;
			
		}
}

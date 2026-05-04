package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(id = "Email")
	private WebElement emailid;
	
	@FindBy(id = "Password")
	private WebElement passwordlink;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;
	
	public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	public Object getEmailTextField() {
		return emailid;
	}
	
	public Object getPasswordtextField() {
		return passwordlink;
	}
	
	public Object getLoginButton() {
		return loginbutton;
	}

}

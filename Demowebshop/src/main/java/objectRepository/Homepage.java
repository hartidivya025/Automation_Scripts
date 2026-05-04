package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booklink;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement lcomputerlink;
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement electronicslink;
	
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftcardslink;
	
	@FindBy(id = "products-orderby")
	private WebElement productsid;
	
	public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	}

	public Object getBOOKSLink() {
		// TODO Auto-generated method stub
		return null;
	}
}

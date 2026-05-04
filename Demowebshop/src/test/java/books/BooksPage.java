package books;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage {
	public BooksPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "Sort by")
	private WebElement sortbylink;

	public WebElement getSortBy() {
		// TODO Auto-generated method stub
		return null;
	}

}

package books;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.Baseclass;
import objectRepository.Homepage;

public class Test_01 {
	public class Dws_TC_01Test extends Baseclass {
		  @Test(priority = 1)
		  public void clickOnBooksLink() throws IOException, InterruptedException {
			  
			Homepage hp=new Homepage(driver);
			hp.getBOOKSLink().click();
			
			BooksPage bp=new BooksPage(driver);
			bp.getSortBy().click();
			
			wutil.selectDropdown(futil.getDataFromProperty("lowToHigh"),bp.getSortBy());
			
			List<WebElement> pro = wutil.multi(driver,"//div[@class='product-item']");
			 
			double lowest = 0.0;
			for(WebElement op:pro) {
				String price = wutil.single(driver,"//span[@class='price actual-price']").getText().trim();
				double pri =Double.parseDouble(price);

						if(lowest<=pri) {
							lowest=pri;
							bp.getAddToCart().click();
							
						}
			}
		  }
	}
}

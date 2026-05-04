package testng;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToScrollTillBottom extends Baseclass{
	@Test
	public void scrolltillbottom() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight)");
		Reporter.log("Scrolled till bottom",true);
	}
	

}

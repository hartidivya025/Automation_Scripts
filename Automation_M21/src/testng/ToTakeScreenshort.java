package testng;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToTakeScreenshort extends Baseclass{
	@Test
	public void takescreenshortofwebpage() throws IOException {
		
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File prem = new File("./Screenshort/"+timestamp+".png");
		FileHandler.copy(temp, prem);
		Reporter.log("Screenshort is captured",true);
	}

}

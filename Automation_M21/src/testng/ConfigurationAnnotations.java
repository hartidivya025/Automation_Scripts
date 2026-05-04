package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ConfigurationAnnotations {
	
	@BeforeSuite
	public void beforesuit() {
		Reporter.log("Before suite is executed",true);
	}
	
	@AfterSuite
	public void aftersuit() {
		Reporter.log("After suite is executed",true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("Before Test is exucuted",true);
	}
	
	@AfterTest 
	public void aftertest() {
		Reporter.log("After Test is executed",true);
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("Before class is executed",true);
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("After class is executed",true);
	}
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("Before method is executed",true);
	}
	
	@AfterMethod
	public void aftermethod() {
		Reporter.log("After method is executed",true);
	}
	
	@Test
	public void test() {
		Reporter.log("Test is executed",true);	
	}

}

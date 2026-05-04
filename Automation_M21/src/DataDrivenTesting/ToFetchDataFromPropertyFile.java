package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./TestData/commondata.properties");
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String email = prop.getProperty("email");
		System.out.println(email);
		
		String pass = prop.getProperty("password");
		System.out.println(pass);
		
		
	}  	
		
	
}


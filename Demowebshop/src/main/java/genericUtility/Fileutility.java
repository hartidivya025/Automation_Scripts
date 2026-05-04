package genericUtility;


public class Fileutility {
	
}
	public String getDataFromProperty(String key) throws IOException {
    	FileInputStream fis = new FileInputStream("./src/test/resource/TestData/commondata.properties");
    	Properties prop = new Properties();
    	prop.load(fis);
    	
		return prop.getProperty(key);

}

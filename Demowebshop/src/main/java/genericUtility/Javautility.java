package genericUtility;

public class Javautility {
	
	public int getRandomNumber() {
		Random ran = new Random();
		return ran.nextInt();
		
	}
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
		
	}

}

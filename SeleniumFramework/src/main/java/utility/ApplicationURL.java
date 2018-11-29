package utility;

public class ApplicationURL {
	
	
	public static String orangeURL = "http://127.0.0.1/orangehrm-4.1.2.1/symfony/web/index.php/auth/login";
	public static String vtigerURL = "http://localhost:8888/index.php?action=Login&module=Users";
	
	public static String getURL(String application) {
		String setURL;
		if(application.equalsIgnoreCase("ORANGHRM")) {
			setURL = orangeURL;
		}else {
			setURL = vtigerURL;
		} 
		return setURL;
	} 

}

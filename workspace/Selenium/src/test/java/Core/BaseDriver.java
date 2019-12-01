package Core;

import org.openqa.selenium.WebDriver;

import utils.PropertyUtil;

public class BaseDriver {

	public WebDriver driver;
	String path = System.getProperty("user.dir");

	public void startSession() {

		try {
			PropertyUtil pus = new PropertyUtil (path+ "\\selenium.properties");
			String browser = pus.getProperty("browser");
			
			if(browser.equalsIgnoreCase("Firefox")) {
				
			}
		 }
	}
}

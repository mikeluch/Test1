package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalProject {
	
	private static void sendkeys(String string) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Google Web Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		driver.findElement(By.id("get-input")).click();
		sendkeys("Alex");
	//	driver.findElement(By.xpath("//*[@id='get-input']")).click();
			
		//Thread.sleep(5000);

	//	driver.quit();
	}


}

package endtoendproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {
	
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		System.out.println("Hello World");
		System.setProperty("webdriver.gecko.driver","/Users/Arun/Practical Programs/EndtoEndProject/geckodriver");
		driver.get("/http://chromedriver.storage.googleapis.com/index.html?path=2.30/");
		System.out.println("Hi");
		Thread.sleep(3000);
			driver.close();

	}

}

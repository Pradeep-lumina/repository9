package practice;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void login_page() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");		
		
		WebDriver driver = new ChromeDriver();
		
		Reg_Page1 RPage = new Reg_Page1(driver);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Logger logger = Logger.getLogger("login_page");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get("https://www.facebook.com/");
		logger.info("URL Open Succssfully");
		
		RPage.txtusername("Testing");
		Thread.sleep(2000);
		logger.info("Username entered");
		
		RPage.txtpassword("password");
		logger.info("Password entered");
	}

}

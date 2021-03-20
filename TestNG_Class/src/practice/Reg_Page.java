package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reg_Page {
	
	WebDriver driver;
	
	By username = By.id("email");
	By password = By.id("pass");
	
	Reg_Page(WebDriver d)
	{
		driver=d;
	}
	
	public void txtusername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void txtpassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}

}

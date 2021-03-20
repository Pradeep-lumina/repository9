package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Reg_Page1 {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(how=How.ID, using="pass")
	WebElement password;
	
	Reg_Page1(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void txtusername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void txtpassword(String pwd)
	{
		password.sendKeys(pwd);
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class LoginPage extends WebTestBase{

	@FindBy(xpath="//input[@type='email']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@id='customer[password]']")
	WebElement passWord;
	
	@FindBy(xpath="//button[@class='form__submit button button--primary button--full']")
	//@FindBy(linkText = "LOGIN")
	WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(String emailid,String password)
	{
		emailId.sendKeys(emailid);
		passWord.sendKeys(password);
		loginbtn.click();
	}
	
}

package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import utils.Utils;

public class MyAccountPage extends WebTestBase {
	
	/*@FindBy(xpath = "//h1[@class='heading h2']")
    WebElement accountTitle;*/
	
	@FindBy(xpath = "//span[@class='st-desktop-icons']//span[@class='st-search-icon']")
	WebElement search;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchtextbox;

	@FindBy(xpath = "//a[@class='header__linklist-link link--animated']")
	WebElement hover;
	
	@FindBy(linkText = "Sarees")
	WebElement sarees;
	
	@FindBy(linkText = "Cotton Sarees")
	WebElement cottonsaree;
	
	@FindBy(xpath="//div[@class='filter-items active']//div[@class='filter-item-head']")
	WebElement filter;
	
	@FindBy(xpath="//input[@value='Blue']")
	WebElement checkbox;

	@FindBy(xpath = "//a[@class='social-media__link']")
	WebElement facebookoption;
	    
	public MyAccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	/*public String getTextOFMYAccountPage(){
        return accountTitle.getText();
    }*/

	
	public void search(){
		search.click();
        searchtextbox.click();
        searchtextbox.sendKeys("Banarasi Sarees");
        searchtextbox.sendKeys(Keys.ENTER);
      
    }
	 

    public void mouseHover(){
       Utils.mouseHover(driver,hover);
    }
    
    public void mouseHoverSelectValue()
    {
    	Utils.mouseHovercheck(driver,sarees,cottonsaree);
    	
    }


    public void scrollDownMethod() {
        Utils.scrollDownByElement(driver, facebookoption);
        facebookoption.click();

    }

    public void windowHandle(){
        Utils.scrollDownByElement(driver,facebookoption);
        facebookoption.click();
        Utils.switchToWindows(driver);
    }

    public void getCookiesHandle(){
        Utils.getCookies();
    }
    
}

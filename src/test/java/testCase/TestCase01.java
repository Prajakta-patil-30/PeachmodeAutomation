package testCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

import testBase.WebTestBase;

public class TestCase01 extends WebTestBase{
	LoginPage loginPage;
	HomePage homepage;
	MyAccountPage myAccountPage;
	
	//constructor 
	public TestCase01()
	{
		super();
	}
	
	@BeforeMethod
    public void beforeMethod(){
        initialization();
        loginPage = new LoginPage();
    	myAccountPage = new MyAccountPage();
		homepage = new HomePage();
		
   
    }
        @Test
        public void verifyLoginWithValidCredential(){
            SoftAssert softAssert = new SoftAssert();
            homepage.userSearchClick();
            loginPage.login(prop.getProperty("emailid"), prop.getProperty("password"));
            
            
            softAssert.assertAll();
    }
        @Test
        public void verifySearchBar(){
            SoftAssert softAssert = new SoftAssert();
            myAccountPage.search();
            softAssert.assertAll();
        }
        
        @Test
        public void verifyMouseHover(){
            SoftAssert softAssert = new SoftAssert();
            myAccountPage.mouseHover();
            softAssert.assertAll();
        }
        
        @Test
        public void verifyhoverclick()
        {
        	 SoftAssert softAssert = new SoftAssert();
             myAccountPage.mouseHoverSelectValue();
             softAssert.assertAll();
        }

        @Test
        public void verifyScrollDown(){
            SoftAssert softAssert = new SoftAssert();
            myAccountPage.scrollDownMethod();
            softAssert.assertAll();
        }

        @Test
        public void verifyGetWindowHandle(){
            SoftAssert softAssert = new SoftAssert();
            myAccountPage.windowHandle();
            softAssert.assertAll();
        }

        @Test
        public void verifyCookiesHandle(){
            SoftAssert softAssert = new SoftAssert();
            myAccountPage.getCookiesHandle();
            softAssert.assertAll();
        }

        @AfterMethod
        public void afterMethod(){
            driver.close();
        }

}

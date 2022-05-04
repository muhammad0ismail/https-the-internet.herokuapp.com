package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SecureAreaPage;
import pages.loginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

// use extend to import form basetest class
public class loginTests extends BaseTest {
@Test
    public void testSucceffullogin(){
        loginPage loginPage=HomePage.Login();
        loginPage.setusernameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
       SecureAreaPage secureAreaPage= loginPage.clickLoginbuuton();
      assertTrue ( secureAreaPage.getAlertText().contains("You logged into a secure area"),"FAILS");


    }
}

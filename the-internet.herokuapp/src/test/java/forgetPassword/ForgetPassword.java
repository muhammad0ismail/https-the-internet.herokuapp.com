package forgetPassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPassword;

import static org.testng.Assert.assertTrue;

public class ForgetPassword extends BaseTest {
    @Test
public void ForgetPassword(){
    var ForgotPassword =HomePage.getClick();
        ForgotPassword.setpasswordField("ahmed@gmail.com");
      //  var emailSentPage =ForgotPassword.setpasswordField("ahmed@gmail.com");

      //  assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");
    }
}

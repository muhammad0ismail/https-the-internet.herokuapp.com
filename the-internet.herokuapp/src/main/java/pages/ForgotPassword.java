package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordButton = By.id("form_submit");
    public ForgotPassword (WebDriver driver){
        this.driver=driver;
    }
      public void setpasswordField (String password){
        driver.findElement(emailField).sendKeys(password);
     }
    public EmailSentPage clickRetrievePassword(){
        driver.findElement(passwordButton).click();
        return new EmailSentPage(driver);
    }

}

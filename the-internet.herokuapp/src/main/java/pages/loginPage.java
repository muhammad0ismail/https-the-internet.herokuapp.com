package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver;
  /*
  to add the flied of pages in to access them

  * */
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    /*
    * to access button login in case that don't have id
    * */
private By loginButton = By.cssSelector("#login button ");
    public loginPage (WebDriver driver){
        this.driver =driver;


    }
    public void setusernameField (String username){
        // use sendKeys to type text  in it
driver.findElement(usernameField).sendKeys(username);

    }
    public  void  setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginbuuton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage (driver);
    }
}

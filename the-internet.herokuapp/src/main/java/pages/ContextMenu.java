package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
    private WebDriver driver;
    private By context =By.id("hot-spot");
    public ContextMenu (WebDriver driver){
        this.driver=driver;
    }
    public void clickCOntext(){
      /*
      * Actions class is an ability provided by Selenium for handling keyboard and mouse events
      * . In Selenium WebDriver, handling these events includes operations such as drag and drop,
      *  clicking on multiple elements with the control key, among others.
      * These operations are performed using the advanced user interactions API.
      * It mainly consists of Actions that are needed while performing these operations.

       * */
        Actions actions=new Actions(driver);
        /*
        * contextClick(): Performs right-click on the mouse
        * */
        actions.contextClick(driver.findElement(context)).perform();
    }
    public String getPopUp(){
        return driver.switchTo().alert().getText();
    }
    public void acceptPopUp(){
        driver.switchTo().alert().accept();
    }
}

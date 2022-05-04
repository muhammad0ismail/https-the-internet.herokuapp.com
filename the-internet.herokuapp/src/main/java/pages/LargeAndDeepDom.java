package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDom {
    private WebDriver driver ;
    private By table = By.id("large-table");
    public  LargeAndDeepDom (WebDriver driver){
        this.driver =driver;
    }
public void scrollTable(){
    WebElement tableElement=driver.findElement(table);
    /*
    to allow you to use JavaScript in selunmin
    we put () to cast the driver by JavaScript
     executeScript  to write code of JavaScript
    * */
        String script = "arguments[0].scrollIntoView();";
// table element to replace element with arguments
    ((JavascriptExecutor)driver).executeScript(script,tableElement);
}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElemenPageIsHidden { private WebDriver driver;
    private By Start = By.cssSelector("#start button");
    private By loadingIndeactor = By.id("loading");
    private By finshText = By.id("finish");
    public ElemenPageIsHidden (WebDriver driver){
        this.driver=driver;
    }

    public String clickStart(){
driver.findElement(Start).click();
/*  to  wait only for specific method  it won't do anything i must add expected condition
 to make wat for some condition to meet */
   //     WebDriverWait wait = new WebDriverWait(driver,5);
 //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndeactor)));
    /*
    *  another method to make time wait and specify some condition to more control on time wait
    *
    * */

        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndeactor)));

        return driver.findElement(finshText).getText();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLodingPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));
    public DynamicLodingPage (WebDriver driver){
        this.driver=driver;
    }

    public ElemenPageIsHidden clickElemenPageIsHidden(){
        driver.findElement(link_Example1).click();
        return new ElemenPageIsHidden(driver);

    }
    public renderedPage clickrRnderedPagn(){
        driver.findElement(link_Example2).click();
        return new renderedPage (driver);

    }
public ElemenPageIsHidden cickDynamic(){
    Actions actions=new Actions(driver);
   // actions.clickAndHold(driver.findElement(link_Example1)).keyDown(Keys.CONTROL).perform();
  //  actions.clickAndHold(driver.findElement(link_Example1)).sendKeys(Keys.CONTROL).perform();
   // driver.findElement(link_Example1).sendKeys(Keys.CONTROL, Keys.RETURN);
   // actions.clickAndHold(Keys.CONTROL)(driver.findElement(link_Example1)).perform();
    actions.keyDown(Keys.CONTROL).clickAndHold(driver.findElement(link_Example1)).perform();
    return new ElemenPageIsHidden(driver);

}
}

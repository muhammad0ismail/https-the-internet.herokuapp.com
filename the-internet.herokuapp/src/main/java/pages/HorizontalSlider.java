package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.print.DocFlavor;

public class HorizontalSlider {
    private WebDriver driver;
    private By range =By.id("range");
    private By slider = By.cssSelector(".sliderContainer input");
    public HorizontalSlider ( WebDriver driver){
        this.driver=driver;
    }
public  void   setSliderValue (String value ){
   while (!getSliderValue().equals(value)) {
       driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
   }

}
public String getSliderValue(){
return driver.findElement(range).getText();
}

}

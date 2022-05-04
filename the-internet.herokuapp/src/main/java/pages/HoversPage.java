package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class HoversPage {
    private WebDriver driver;
    private By figureBox=By.className("figure");
    private By BoxCaptiion =By.className("figcaption");
    public HoversPage (WebDriver driver){
        this.driver=driver;

    }
    /*to import class action to hover on the page
index start at 1
    * */

    public FigureCaption hoverOverFigure(int index ){
       // because index start at zero
        WebElement figure =driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        // i must call perform to make action  i can call more function and make them work ar once
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(BoxCaptiion));
    }
    public class FigureCaption{
        private WebElement caption;
        private By header =By.tagName("h5"); // to fine text
        private By link = By.tagName("a");  // to find caption

        public FigureCaption (WebElement caption){
            this.caption=caption;

        }
        public boolean isCaptionDiplayed(){
             return caption.isDisplayed();
        }
        public  String getTitle(){
            return  caption.findElement(header).getText();
        }
        public String getLink(){
            /* to get the link by its attribute */
            return  caption.findElement(link).getAttribute("href");

        }
        public String getLinkText() {
        return caption.findElement(link).getText();
        }
        }
}

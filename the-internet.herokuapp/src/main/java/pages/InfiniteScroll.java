package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScroll {
    private WebDriver driver;
    By textBlocks = By.className("jscroll-added");
    public InfiniteScroll (WebDriver driver){
        this.driver=driver;
    }
    /***
     * * scroll until paragraph wit index specified is in view
     *
     * @param //index 1-based
     */

    public void scrollToPragah( int index){
        /*to scroll down until we got the exact  paragraph
         * */
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while(getNumberOfParagraphsPresent() < index){
            jsExecutor.executeScript(script);
        }
    }

    /* to know how many of paragraph */
    private int getNumberOfParagraphsPresent(){
        return driver.findElements(textBlocks).size();

    }
}


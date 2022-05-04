package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysuwygEditorPage {
    private WebDriver driver;
    private String edtiorIframId ="mce_0_ifr";
    //private By textEditor= By.id("tinymce");
    private By textEditor= By.className("mce-content-body");
    private By decreaseButton = By.cssSelector("[title=\"Increase indent\"]");
    public WysuwygEditorPage (WebDriver driver){
        this.driver=driver;

    }

    public void clearEditor(){
        /*i should enter the i frame and exit it every time because i don't know the next step of test or when it stuck
         * */
        switchToEditArea();
        driver.findElement(textEditor).clear();
        switchToMainArea();
    }


    public void putTExt(String text ){
        switchToEditArea();
        driver.findElement(textEditor).sendKeys(text);
        switchToMainArea();
    }
    public String getTextFromEditot(){
        switchToEditArea();
        String message=  driver.findElement(textEditor).getText();
        switchToMainArea();
        return message;
    }
    public void decreaseIndention(){
        driver.findElement(decreaseButton).click();
    }
    private void switchToEditArea(){

        /*
         * to switch to frame (because frame is inside html )
         * frame ( to find by xpath or class name or ccs selector so choose first element
         * or find by index so pass integer
         * or provide id
         * */
        driver.switchTo().frame(edtiorIframId);
    }

    private void switchToMainArea(){
        /* to quit the iframe and go page frame
        * */
        driver.switchTo().parentFrame();
    }



}

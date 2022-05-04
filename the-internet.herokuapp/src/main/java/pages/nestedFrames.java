package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nestedFrames {
    private WebDriver driver;
    private By Left= By.name("LEFT");
    private String bottomFrame = "frame-bottom";
    private String Frame_Left="frame-left";
    private By bottom= By.name("BOTTOM");
    private By body =By.tagName("body");
    public nestedFrames(WebDriver driver){
        this.driver=driver;
    }
    public String clickNestedLeft(){
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame( Frame_Left);
        String text =getFrameText();
        /*
        * must add driver.switchTo().parentFrame(); twice to go the main frame first time is get out from frame-left to frame-top
        * second time to go from frame-top to main frame
        *
        **/
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return  text;


    }
    public String clickNestedButton(){
        driver.switchTo().frame("frame-bottom");
        String text =getFrameText();
        driver.switchTo().parentFrame();
        return text;


    }

    private String  getFrameText(){
        return driver.findElement(body).getText();
    }

}

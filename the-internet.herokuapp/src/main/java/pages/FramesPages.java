package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPages {
    private WebDriver driver;
    public FramesPages(WebDriver driver){
        this.driver=driver;
    }
    private void clickNestedLink(String LinkText) {
        driver.findElement(By.linkText(LinkText)).click();
    }
        public nestedFrames clickonNestedFrames(){
        clickNestedLink("Nested Frames");
        return new nestedFrames(driver);

        }


    }



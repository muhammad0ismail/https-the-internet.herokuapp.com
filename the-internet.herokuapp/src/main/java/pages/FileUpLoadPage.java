package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpLoadPage {
    private WebDriver driver;
    private By inputFile =By.id("file-upload");
    private By upLoadButton = By.id("file-submit");
    private By UpLoadedfile = By.id("uploaded-file");
    public FileUpLoadPage (WebDriver driver){
        this.driver=driver;

    }
    public void clickUpLoadButton(){
        driver.findElement(upLoadButton).click();
    }
public void UploadFile (String absolutePathOfFile ){

        driver.findElement(inputFile).sendKeys(absolutePathOfFile);
        clickUpLoadButton();
}
public String getUploadedFile(){
        return driver.findElement(UpLoadedfile).getText();

}
}

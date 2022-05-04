package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPages {
    private WebDriver driver;
    private By clickForjs= By.xpath(".//button[text()='Click for JS Alert']");
    private By result=By.id("result");
private By confirmButton = By.xpath(".//button[text()='Click for JS Confirm']");

private By prompt = By.xpath(".//button[text()='Click for JS Prompt']");

    public AlertsPages(WebDriver driver) {
        this.driver =driver;
    }

public void tiggerAlertButton(){
        driver.findElement(clickForjs).click();

}
    public void cofirmAlertButton(){
        driver.findElement(confirmButton).click();

    }
    public void promptAlertButton(){
        driver.findElement(prompt).click();

    }

    public void alert_JSPrompt(String text ){

        /*
         * use switchTo() method to switch from dom to other anything
         *
         * to click on pop windows that show
         * */
        driver.switchTo().alert().sendKeys(text);

    }
public void alert_acceptAlert(){

        /*
        * use switchTo() method to switch from dom to other anything
        *
        * to click on pop windows that show
        * */
    driver.switchTo().alert().accept();

}
    public void canceltAlert(){

        /*
         * use switchTo() method to switch from dom to other anything
         *
         * to click on pop windows that show and press cancel
         * */
        driver.switchTo().alert().dismiss();

    }
    public String getAlertText(){
        return driver.findElement(result).getText();

    }


    public String alert_gettext(){
        return driver.switchTo().alert().getText();
    }

}

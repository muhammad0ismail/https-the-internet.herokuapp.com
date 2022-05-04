package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class renderedPage {
    private WebDriver driver;
    private By Start = By.cssSelector("#start button");
    private By loadingIndeactor = By.id("loading");
    private By finshText = By.id("finish");

    public renderedPage(WebDriver driver) {
        this.driver = driver;
    }


    public String clickStart() {
        driver.findElement(Start).click();
        FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndeactor)));

        return driver.findElement(finshText).getText();
    }
}
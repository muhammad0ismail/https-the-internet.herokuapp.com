package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    private WebDriver driver;

    //private By frormAuthenticationLink= new By.ByLinkText("Form Authentication");
    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public loginPage Login() {
        clickLink("Form Authentication");
        return new loginPage(driver);

    }

    public DropdownPage getClickDrop() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgotPassword getClick() {
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }

    public HoversPage clickHover() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public HorizontalSlider clickHorozontal() {
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }

    public AlertsPages clickAlerts() {
        clickLink("JavaScript Alerts");
        return new AlertsPages(driver);

    }

    public FileUpLoadPage clickfileUpload() {
        clickLink("File Upload");
        return new FileUpLoadPage(driver);
    }

    public ContextMenu clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenu(driver);
    }

    public WysuwygEditorPage clickWysuwygEditorPage() {
        clickLink("WYSIWYG Editor");
        return new WysuwygEditorPage(driver);
    }

    public FramesPages clickFramesPages() {
        clickLink("Frames");
        return new FramesPages(driver);
    }

    public DynamicLodingPage clickDynamicLodingPage() {
        clickLink("Dynamic Loading");
        return new DynamicLodingPage(driver);

    }

    public LargeAndDeepDom clickLargeAndDeepDom() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDom(driver);
    }

    public InfiniteScroll clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScroll(driver);
    }
    public Dropdown clickDropdown(){
        return new Dropdown(driver);
    }
public MultipleWindows clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindows(driver);

}
public KeyPressPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressPage(driver);
}
    private void clickLink(String LinkText) {
        driver.findElement(By.linkText(LinkText)).click();
    }
}

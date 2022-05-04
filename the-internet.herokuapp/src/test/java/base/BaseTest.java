package base;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.FramesPages;
import pages.homePage;
import utils.EventReporter;
import utils.windowManger;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    /*
to capture or record something when specific  events of selenium happen
    * */
    private EventFiringWebDriver driver;
//private WebDriver driver;
   protected pages.homePage HomePage;
  //  protected pages.FramesPages Frames;
  @BeforeClass
  public void setUp(){
      System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");


      /*
       * that will listen to event
       * getChormeOption()  to control in chrome when it open
       * */
      driver = new EventFiringWebDriver(new ChromeDriver(getChormeOption()));
      driver.register(new EventReporter());

 //     driver =new ChromeDriver();
      driver.get("https://the-internet.herokuapp.com/");
      HomePage =new homePage(driver);

                /*
        to till test wait for  that time if you find element before time end interact with  it or not continue  to pull to get
        th element until time is done and if you can't find it return exception no element found
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          you do this on scale of project and the wait every time

        * */
      //  driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS); to wiat for page load

      goHome();
      setCookie();

      //  driver.get("https://transporter-admin.thewebops.com/");
        /* wo change window of page
       driver.manage().window().maximize(); to max size of screen

         to set size of window
        driver.manage().window().setSize(new Dimension(width ,height );

        driver.manage().window().fullscreen();
      */
        /*to find element in java
        and return the first one it see
        * */
      /* WebElement inputsLink=  driver.findElement(By.linkText("Shifting Content"));
      /* to make list of elements
        inputsLink.click();
        WebElement inputsLink2=  driver.findElement(By.linkText(("Example 1: Menu Element")));
        inputsLink2.click();
        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size());
         System.out.println(driver.getTitle());
         /*
         * to close the page
         * */

  }

    @BeforeMethod
    public void goHome(){

        driver.get("https://the-internet.herokuapp.com/");
        HomePage =new homePage(driver);
    }


   /* @AfterClass
    public void tearDown(){
        driver.quit();
    }
  /*  public static void main (String arg []){
       BaseTest test =new BaseTest();
       test.setUp();
    }*/


    @AfterMethod

    /**
     * to take screen shot from web
     * public interface TakesScreenshot
     *
     * Indicates a driver or an HTML element that
     * can capture a screenshot and store it in different ways.
     * */
    public void RecordFailure(ITestResult result) {
        if(ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File creenshot = camera.getScreenshotAs(OutputType.FILE);
            /*\
             * The getAbsolutePath() method is a part of File class. This function returns the absolute pathname of the given file object.
             * If the pathname of the file object is absolute
             * then it simply returns the path of the current file object.
             * Exception: This method throws Security Exception
             * if the required property value cannot be accessed.
             *
             * */
            // System.out.println("Screen taken"+creenshot.getAbsolutePath());
            try {
                Files.move(creenshot, new File("resources/ScreenShots/"+result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * to control the extensions and options of Google Chrome  and use it
     *
     *
     */

    private ChromeOptions getChormeOption(){
        ChromeOptions options = new ChromeOptions();
options.addArguments( "disable-infobars");
/*
to run the tests without open the chrome

*/
// options.setHeadless(true);
return options;
    }
/*
* to mange cookie of web driver
* */
    private void setCookie(){

        /*Builder to help you build the in more effecient way
       *domain is location of webt site that we store in
         */
       Cookie cookie =new Cookie.Builder("test","1234").domain("the-internet.herokuapp.com").build();

       /*we have use driver to use of cookies

       * */
       driver.manage().addCookie(cookie);
    }

    public windowManger getWindowMangee()
    {
        return new windowManger(driver);
    }
}

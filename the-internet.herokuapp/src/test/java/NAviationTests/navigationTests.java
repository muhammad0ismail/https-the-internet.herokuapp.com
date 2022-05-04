package NAviationTests;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class navigationTests extends BaseTest {
    @Test
    public void testNavigator(){
        HomePage.clickDynamicLodingPage().clickElemenPageIsHidden();
        getWindowMangee().goBack();
        getWindowMangee().refreshPage();
        getWindowMangee().goForward();
        getWindowMangee().goTo("https://google.com");
    }

    @Test
    public void  testSwitchTab(){
        HomePage.clickMultipleWindows().clickHere();
        getWindowMangee().switchToTab("New Window");

    }
    @Test
    public void testing(){
      var wait=  HomePage.clickDynamicLodingPage().cickDynamic();
        var message =wait.clickStart();
        assertEquals(message,"Hello World!","false");
    }

}

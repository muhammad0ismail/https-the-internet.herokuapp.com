package wait;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
@Test
public class TestWait extends BaseTest {
    public void ClickTestWait() {
        var wait = HomePage.clickDynamicLodingPage().clickElemenPageIsHidden();
    var message =wait.clickStart();
        assertEquals(message,"Hello World!","false");
    }
}

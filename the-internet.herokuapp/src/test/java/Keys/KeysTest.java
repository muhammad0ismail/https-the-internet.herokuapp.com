package Keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTest extends BaseTest {
    @Test
    public void testBackspace(){
        var keyPage = HomePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(), "You entered: BACK_SPACE1");
    }
    @Test
    public void testPi(){
        var keyPage = HomePage.clickKeyPresses();
        keyPage.enterPi();
        /*
            NOTE: we didn't finish this test in the video.
            We debugged to watch it enter the pi key
         */
    }
}

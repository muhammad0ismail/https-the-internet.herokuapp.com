package renderedPage;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
@Test
public class TestrenderedPage  extends BaseTest {


        public void ClickTestTestrenderedPage() {
            var wait = HomePage.clickDynamicLodingPage().clickrRnderedPagn();
            var message =wait.clickStart();
            assertEquals(message,"Hello World!","false");
        }
}

package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTest {
    @Test
    public void testHoverUser1(){
      var hoverPage=  HomePage.clickHover();
      var caption = hoverPage.hoverOverFigure(1);
assertTrue(caption.isCaptionDiplayed(),"wrong");
assertEquals(caption.getTitle(),"name: user1","wrong caption");
assertEquals(caption.getLinkText(),"View profile","wrong caption2");
assertTrue(caption.getLink().endsWith("/users/1"),"wrong3");
    }
}

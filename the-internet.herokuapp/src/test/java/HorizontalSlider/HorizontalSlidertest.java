package HorizontalSlider;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class HorizontalSlidertest extends BaseTest {
    @Test
    public void HorizontalSlidertest() {
        String value ="4";
        var Horizontal = HomePage.clickHorozontal();
        Horizontal.setSliderValue(value);
        assertEquals(Horizontal.getSliderValue(),value,"slider value is not correct");
    }
}

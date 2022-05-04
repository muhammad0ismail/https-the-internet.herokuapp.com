package nestedFrame;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testNestedFrames extends BaseTest {
@Test
    public void  clickOntestNestedFrames(){
    var nestedFrame =   HomePage.clickFramesPages().clickonNestedFrames();
    var  message =nestedFrame.clickNestedLeft();
    var text =nestedFrame.clickNestedButton();
    assertEquals(message,"LEFT","false");

    assertEquals(text,"BOTTOM","false");
}
}

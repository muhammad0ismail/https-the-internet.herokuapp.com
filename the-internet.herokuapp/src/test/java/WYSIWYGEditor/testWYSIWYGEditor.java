package WYSIWYGEditor;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testWYSIWYGEditor extends BaseTest {
    @Test
    public void enterFrameText(){
        var enterFramePage =HomePage.clickWysuwygEditorPage();
        enterFramePage.clearEditor();
        String text1="hello world !!";
        String text2 ="fuck!!";
        enterFramePage.putTExt(text1);
        enterFramePage.decreaseIndention();
        enterFramePage.putTExt(text2);
        assertEquals(enterFramePage.getTextFromEditot(),text1+text2,"false");

    }
}

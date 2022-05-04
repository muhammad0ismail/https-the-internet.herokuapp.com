package javaScript;

import base.BaseTest;
import org.testng.annotations.Test;

public class javaScriptTest extends BaseTest {
    @Test
    public  void javaScriptTest(){
        var scroll = HomePage.clickLargeAndDeepDom();
        scroll.scrollTable();
    }
    @Test
    public void  testInfiniteScroll(){
        var infinte =HomePage.clickInfiniteScroll();
        infinte.scrollToPragah(5);
    }

}

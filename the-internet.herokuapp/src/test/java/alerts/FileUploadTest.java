package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {
    @Test
    public  void testFileUpLoad(){
        var upLoadPafe = HomePage.clickfileUpload();
        upLoadPafe.UploadFile("D://testing automate//prj2//resources//chromedriver.exe");
assertEquals(upLoadPafe.getUploadedFile(),"chromedriver.exe","uploaded");
    }
}

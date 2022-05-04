package Dropdown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.homePage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropdownTest extends BaseTest {
    @Test
    public  void  testSelectoption(){
      var dropDownPage=  HomePage.getClickDrop();
      String option= "Option 1";
dropDownPage.selectFromDropDwon(option);
var selectedoptions= dropDownPage.getSelectedoption();
    assertEquals(selectedoptions.size(),1,"incorrect number of selection ");
    assertTrue(selectedoptions.contains(option),"option not selected");
    }
}

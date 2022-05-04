package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown=By.id("dropdown");
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }
public void selectFromDropDwon (String option){
    findDropDownElement().selectByVisibleText (option);
    }
    public List <String> getSelectedoption(){

        /* collect text of all option by make a list of all option  then add function to collect text only in new text   */
List<WebElement> selectedElement= findDropDownElement().getAllSelectedOptions();
/*
*the Stream API is used to process collections of objects.
* A stream is a sequence of objects that supports various methods
* which can be pipelined to produce the desired result.
* map: The map method is used to returns a stream consisting of the results
* of applying the given function to the elements of this stream
* */
return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    /*to use it more than one time
    * */
private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
}

}

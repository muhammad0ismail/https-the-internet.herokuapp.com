package utils;

import org.openqa.selenium.WebDriver;
public class windowManger {
    private WebDriver driver;
    // because we will  use the navigation class many times
    private WebDriver.Navigation navigate;
    public windowManger(WebDriver driver){
        this.driver=driver;
        navigate =driver.navigate();
    }

    /*
    * all method return void so make sure the tests track the location and where we ?
    * */
    public void goBack()
    {
       navigate.back();
    }
public void goForward()
{
    navigate.forward();
}
public void refreshPage(){
        navigate.refresh();
}
public void goTo(String url)
{
    navigate.to(url);
}
    public void switchToTab(String tabTitle ){
        // to get all the tabs that open
      var windows=  driver.getWindowHandles();
System.out.println("Number of tabs: "+windows.size());
System.out.println("window handles:");
windows.forEach(System.out::println);
for (String window :windows)
{
    System.out.println("Switching to window "+window);
    driver.switchTo().window(window);

    System.out.println("current window title:"+ driver.getTitle());
    // to go out of loop when the condition is meet
    if (tabTitle.equals(driver.getTitle())){
        break;
    }
}
    }

}

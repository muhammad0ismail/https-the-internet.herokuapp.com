package alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AlertTests extends BaseTest {

   @Test
    public void acceptAlret(){

     var acceptAlert=   HomePage.clickAlerts();
        acceptAlert.tiggerAlertButton();
        acceptAlert.alert_acceptAlert();
       assertEquals(acceptAlert.getAlertText(),"You successfully clicked an alert","false");

    }
    @Test
    public void testGettextFromAlert(){
       var confrimPage = HomePage.clickAlerts();
       confrimPage.cofirmAlertButton();
     var message=  confrimPage.alert_gettext();
       confrimPage.canceltAlert();
       assertEquals(message,"I am a JS Confirm","alert text incorrect");
       assertEquals(confrimPage.getAlertText(),"You clicked: Cancel","false");

    }
    @Test
    public void testGEtJsPrompt(){

var  PromptPage = HomePage.clickAlerts();
  PromptPage.promptAlertButton();
  PromptPage.alert_JSPrompt("fuck yeah!!");
       // var message= PromptPage.alert_gettext();
        PromptPage.alert_acceptAlert();

        assertEquals(PromptPage.getAlertText(),"You entered: fuck yeah!!","false");
    }

}

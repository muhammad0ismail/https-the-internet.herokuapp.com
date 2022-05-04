package ContextMenu;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class testContextMenu extends BaseTest {
    public void acceptContextMenu() {
        var contextMenu = HomePage.clickContextMenu();
        contextMenu.clickCOntext();
        String message = contextMenu.getPopUp();
        assertEquals(message, "You selected a context menu", "false");
        contextMenu.acceptPopUp();
    }
}
package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HerokuappContextMenuTest extends BaseTest {

    @Test
    public void checkTextAlert() {
        open("http://the-internet.herokuapp.com/context_menu");
        assertEquals(contextMenuPage.getTextAlert(), "You selected a context menu");
        contextMenuPage.closeAlert();
    }
}

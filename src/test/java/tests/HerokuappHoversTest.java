package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HerokuappHoversTest extends BaseTest {

    @Test
    public void profileNameCheck() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile("1");
        assertEquals(hoversPage.getName("1"), "name: user1");
    }

    @Test
    public void checkNotErrorProfile() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile("1");
        hoversPage.clickLinkName("1");
        assertFalse(hoversProfilePage.getTextError());
    }
}

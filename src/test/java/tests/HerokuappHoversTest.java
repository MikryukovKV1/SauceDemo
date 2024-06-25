package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HerokuappHoversTest extends BaseTest {

    @Test
    public void profileNameCheck_1() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile("1");
        assertEquals(hoversPage.getName("1"), "name: user1");
    }

    @Test
    public void profileNameCheck_2() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile("2");
        assertEquals(hoversPage.getName("2"), "name: user2");
    }

    @Test
    public void profileNameCheck_3() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile("3");
        assertEquals(hoversPage.getName("3"), "name: user3");
    }

    @Test
    public void checkNotErrorProfile_1() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile("1");
        hoversPage.clickLinkName("1");
        assertFalse(hoversProfilePage.getTextError());
    }

    @Test
    public void checkNotErrorProfile_2() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile("2");
        hoversPage.clickLinkName("2");
        assertFalse(hoversProfilePage.getTextError());
    }

    @Test
    public void checkNotErrorProfile_3() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile("3");
        hoversPage.clickLinkName("3");
        assertFalse(hoversProfilePage.getTextError());
    }
}

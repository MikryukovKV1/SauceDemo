package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HerokuappHoversTest extends BaseTest {

    @Test
    public void profileNameCheck_1() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile_1();
        assertEquals(hoversPage.getName_1(), "name: user1");
    }

    @Test
    public void profileNameCheck_2() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile_2();
        assertEquals(hoversPage.getName_2(), "name: user2");
    }

    @Test
    public void profileNameCheck_3() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile_3();
        assertEquals(hoversPage.getName_3(), "name: user3");
    }

    @Test
    public void checkNotErrorProfile_1() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile_1();
        hoversPage.clickLinkName_1();
        assertFalse(hoversProfilePage.getTextError());
    }

    @Test
    public void checkNotErrorProfile_2() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile_2();
        hoversPage.clickLinkName_2();
        assertFalse(hoversProfilePage.getTextError());
    }

    @Test
    public void checkNotErrorProfile_3() {
        open("http://the-internet.herokuapp.com/hovers");
        hoversPage.hoveringProfile_3();
        hoversPage.clickLinkName_3();
        assertFalse(hoversProfilePage.getTextError());
    }
}

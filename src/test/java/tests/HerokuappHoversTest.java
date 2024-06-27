package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HerokuappHoversTest extends BaseTest {

    @DataProvider
    public Object[][] nameCheckData() {
        return new Object[][]{
                {"1", "1", "name: user1"},
                {"2", "2", "name: user2"},
                {"3", "3", "name: user3"}
        };
    }

    @Test(dataProvider = "nameCheckData")
    public void profileNameCheck(String numberProfile, String numberName, String expectedMessage) {
        openHerokuapp("/hovers");
        hoversPage.hoveringProfile(numberProfile);
        assertEquals(hoversPage.getName(numberName), expectedMessage);
    }

    @DataProvider
    public Object[][] checkErrorProfileData() {
        return new Object[][]{
                {"1", "1"},
                {"2", "2"},
                {"3", "3"}
        };
    }

    @Test(dataProvider = "checkErrorProfileData")
    public void checkErrorProfile(String numberProfile, String numberName) {
        openHerokuapp("/hovers");
        hoversPage.hoveringProfile(numberProfile);
        assertTrue(hoversPage.clickLinkName(numberName).getTextError());
    }
}
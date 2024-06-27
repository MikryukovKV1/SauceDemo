package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HerokuappInputsTest extends BaseTest {

    @Test
    public void inputsUpTest() {
        openHerokuapp("/inputs");
        assertEquals(inputsPage.sendKeysUpInput(), "1");
    }

    @Test
    public void inputsDownTest() {
        openHerokuapp("/inputs");
        assertEquals(inputsPage.sendKeysDownInput(), "-1");
    }

    @DataProvider
    public Object[][] sendKeysData() {
        return new Object[][]{
                {"123", "123"},
                {"", ""},
                {"0", "0"},
                {"-9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
                        "-9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"},
                {"0.1", "0.1"},
                {"-0.1", "-0.1"},
        };
    }

    @Test(dataProvider = "sendKeysData")
    public void inputsSendKeysTest(String keys, String expectedKeys) {
        openHerokuapp("/inputs");
        assertEquals(inputsPage.sendKeysInput(keys), expectedKeys);
    }
}
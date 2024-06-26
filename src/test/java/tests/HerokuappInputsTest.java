package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HerokuappInputsTest extends BaseTest {

    @Test
    public void inputsUpTest() {
        open("http://the-internet.herokuapp.com/inputs");
        assertEquals(inputsPage.sendKeysUpInput(), "1");

    }

    @Test
    public void inputsDownTest() {
        open("http://the-internet.herokuapp.com/inputs");
        assertEquals(inputsPage.sendKeysDownInput(), "-1");

    }

    @DataProvider
    public Object[][] sendKeysData() {
        return new Object[][]{
                {"123", "123"},
                {"", ""},
                {"0", "0"},
                {"1s5", "1s5"},
                {"-9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999",
                        "-9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"},
                {"qwer", "qwer"},

                {"$", "$"},
        };
    }

    @Test(dataProvider = "sendKeysData")
    public void inputsSendKeysTest(String keys, String expectedKeys) {
        open("http://the-internet.herokuapp.com/inputs");
        assertEquals(inputsPage.sendKeysInput(keys), expectedKeys);

    }
}

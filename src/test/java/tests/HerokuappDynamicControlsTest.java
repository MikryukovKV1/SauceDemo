package tests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class HerokuappDynamicControlsTest extends BaseTest {

    @Test
    public void checkTextAlert() {
        open("http://the-internet.herokuapp.com/dynamic_controls");
        dynamicControlsPage.waitTextItsGone();
        assertFalse(dynamicControlsPage.isDisplayedCheckbox());
    }
}

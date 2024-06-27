package tests;
import static org.testng.AssertJUnit.*;
import org.testng.annotations.Test;

public class HerokuappTyposTest extends BaseTest {

    @Test(invocationCount = 4)
    public void uncheckedOneCheckbox() {
        openHerokuapp("/typos");
        assertEquals(typosPage.spellCheck(), "Sometimes you'll see a typo, other times you won't.");
    }
}
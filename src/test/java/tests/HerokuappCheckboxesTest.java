package tests;
import static org.testng.AssertJUnit.*;
import org.testng.annotations.Test;

public class HerokuappCheckboxesTest extends BaseTest {

    @Test
    public void uncheckedOneCheckbox() {
        open("http://the-internet.herokuapp.com/checkboxes");
        assertFalse(checkboxesPage.checkedOneCheckbox());
        checkboxesPage.clickOneCheckbox();
        assertTrue(checkboxesPage.checkedOneCheckbox());
    }

    @Test
    public void checkedTwoCheckbox() {
        open("http://the-internet.herokuapp.com/checkboxes");
        assertTrue(checkboxesPage.checkedTwoCheckbox());
        checkboxesPage.clickTwoCheckbox();
        assertFalse(checkboxesPage.checkedTwoCheckbox());
    }
}

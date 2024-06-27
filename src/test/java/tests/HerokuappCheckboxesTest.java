package tests;
import static org.testng.AssertJUnit.*;
import org.testng.annotations.Test;

public class HerokuappCheckboxesTest extends BaseTest {

    @Test
    public void uncheckedOneCheckbox() {
        openHerokuapp("/checkboxes");
        assertFalse(checkboxesPage.checkedOneCheckbox());
        checkboxesPage.clickOneCheckbox();
        assertTrue(checkboxesPage.checkedOneCheckbox());
    }

    @Test
    public void checkedTwoCheckbox() {
        openHerokuapp("/checkboxes");
        assertTrue(checkboxesPage.checkedTwoCheckbox());
        checkboxesPage.clickTwoCheckbox();
        assertFalse(checkboxesPage.checkedTwoCheckbox());
    }
}
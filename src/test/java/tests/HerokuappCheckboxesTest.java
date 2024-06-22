package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuappCheckboxesTest extends BaseTest {


    @Test
    public void uncheckedOneCheckbox() {
        open("http://the-internet.herokuapp.com/checkboxes");
        Assert.assertFalse(checkboxesTest.uncheckedOneCheckbox());
        checkboxesTest.clickOneCheckbox();
        Assert.assertTrue(checkboxesTest.checkedOneCheckbox());
    }

    @Test
    public void checkedTwoCheckbox() {
        open("http://the-internet.herokuapp.com/checkboxes");
        Assert.assertTrue(checkboxesTest.checkedTwoCheckbox());
        checkboxesTest.clickTwoCheckbox();
        Assert.assertFalse(checkboxesTest.uncheckedTwoCheckbox());
    }
}

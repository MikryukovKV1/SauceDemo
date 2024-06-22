package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HerokuappTyposTest extends BaseTest {


    @Test(invocationCount = 4)
    public void uncheckedOneCheckbox() {
        open("http://the-internet.herokuapp.com/typos");
        Assert.assertEquals(typosTest.spellCheck(), "Sometimes you'll see a typo, other times you won't.");

    }
}

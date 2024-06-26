package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @DataProvider
    public Object[][] correctLogData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", "Products"}
        };
    }

    @Test(dataProvider = "correctLogData")
    public void correctLoginPageTest(String username, String password, String expectedMessage) {
        open("https://www.saucedemo.com/");
        loginPage.login(username, password);
        assertEquals(loginPage.getMessageProductPage(), expectedMessage);
    }

    @DataProvider
    public Object[][] notCorrectLogData() {
        return new Object[][]{
                {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."},
                {"standard_user", "secret", "Epic sadface: Username and password do not match any user in this service"},
                {"standard_user", "", "Epic sadface: Password is required"}
        };
    }

    @Test(dataProvider = "notCorrectLogData")
    public void lockedLogin(String username, String password, String expectedMessage) {
        open("https://www.saucedemo.com/");
        loginPage.login(username, password);
        assertEquals(loginPage.getErrorMessage(), expectedMessage);
    }

}

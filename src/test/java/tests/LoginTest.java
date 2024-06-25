package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void correctLogin() {
        open("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(loginPage.getTextCorrectLogin(), "Products");
    }

    @Test
    public void lockedLogin() {
        open("https://www.saucedemo.com/");
        loginPage.login("locked_out_user", "secret_sauce");
        assertEquals(loginPage.getTextLockedLogin(), "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void notCorrectPassword() {
        open("https://www.saucedemo.com/");
        loginPage.login("standard_user", "secret");
        assertEquals(loginPage.getTextNotCorrectPassword(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void emptyPassword() {
        open("https://www.saucedemo.com/");
        loginPage.login("standard_user", "");
        assertEquals(loginPage.getTextEmptyPassword(), "Epic sadface: Password is required");
    }
}

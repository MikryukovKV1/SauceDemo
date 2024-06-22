package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginTest extends BaseTest {

    @Test
    public void correctLogin() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(driver.findElement(By.cssSelector("[class=title]")).getText(), "Products");
    }

    @Test
    public void lockedLogin(){
        loginPage.open();
        loginPage.login("locked_out_user", "secret_sauce");
        assertEquals(driver.findElement(By.xpath("//h3[contains(text(),'user has been locked')]")).getText(), "Epic sadface: Sorry, this user has been locked out.");
    }

    @Test
    public void notCorrectPassword(){
        loginPage.open();
        loginPage.login("standard_user", "secret");
        assertEquals(driver.findElement(By.xpath("//h3[contains(text(),'password do not match')]")).getText(), "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void emptyPassword(){
        loginPage.open();
        loginPage.login("standard_user", "");
        assertEquals(driver.findElement(By.xpath("//h3[contains(text(),'Password is required')]")).getText(), "Epic sadface: Password is required");
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLoginPage extends BasePage{

    private final By USERNAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By ERROR_TEXT_MESSAGE = By.xpath("//h3");

    public SauceLoginPage(WebDriver driver) {
        super(driver);
    }

    public SauceProductPage login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
        return new SauceProductPage(driver);
    }

    public String getErrorMessage() {
        return driver.findElement(ERROR_TEXT_MESSAGE).getText();
    }
}
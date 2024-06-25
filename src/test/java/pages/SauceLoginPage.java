package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLoginPage {

    WebDriver driver;
    private final By USERNAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By ERROR_TEXT_EMPTY_PASSWORD = By.xpath("//h3[contains(text(),'Password is required')]");
    private final By ERROR_TEXT_NOT_CORRECT_PASSWORD = By.xpath("//h3[@data-test='error']");
    private final By ERROR_TEXT_LOCKED_LOGIN = By.xpath("//h3[contains(text(),'user has been locked')]");
    private final By TEXT_CORRECT_LOGIN = By.cssSelector("[class=title]");

    public SauceLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
    }

    public String getTextEmptyPassword() {
        return driver.findElement(ERROR_TEXT_EMPTY_PASSWORD).getText();
    }

    public String getTextNotCorrectPassword() {
        return driver.findElement(ERROR_TEXT_NOT_CORRECT_PASSWORD).getText();
    }

    public String getTextLockedLogin() {
        return driver.findElement(ERROR_TEXT_LOCKED_LOGIN).getText();
    }

    public String getTextCorrectLogin() {
        return driver.findElement(TEXT_CORRECT_LOGIN).getText();
    }

}

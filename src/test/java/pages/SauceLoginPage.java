package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLoginPage {

    WebDriver driver;
    private final By USERNAME_INPUT = By.id("user-name");
    private final By PASSWORD_INPUT = By.id("password");
    private final By LOGIN_BUTTON = By.id("login-button");
    private final By ERROR_TEXT_MESSAGE = By.xpath("//h3");
    private final By TEXT_CORRECT_LOGIN = By.cssSelector("[class=title]");

    public SauceLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).submit();
    }

    public String getMessageProductPage() {
        return driver.findElement(TEXT_CORRECT_LOGIN).getText();
    }

    public String getErrorMessage() {
        return driver.findElement(ERROR_TEXT_MESSAGE).getText();
    }

}

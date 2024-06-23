package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HerokuappNotificationMessagePage extends BasePage {

    private final By LINK_HERE = By.xpath("//a[text()='Click here']");
    private final By NOTIFIC_TEXT = By.xpath("//*[contains(text(),'successful')]");
    private final By NOTIFIC_TEXT2 = By.xpath("//*[contains(text(),'unsuccesful')]");
    private final By NOTIFIC = By.xpath("//div[@id='flash']");

    public HerokuappNotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void waitText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NOTIFIC));
    }

    public void clickLink() {
        driver.findElement(LINK_HERE).click();
    }

    public String getTextNotif() {
        return driver.findElement(NOTIFIC_TEXT).getText();
    }

    public String getTextNotifER() {
        return driver.findElement(NOTIFIC_TEXT2).getText();
    }
}

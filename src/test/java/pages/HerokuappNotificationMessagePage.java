package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HerokuappNotificationMessagePage extends BasePage {

    private final By CLICK_HERE = By.xpath("//a[text()='Click here']");
    private final By NOTIFIC = By.xpath("//div[@id='flash']");

    public HerokuappNotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void clickLink() {
        driver.findElement(CLICK_HERE).click();
    }

    public boolean clickToTheSuccessfulStatus() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NOTIFIC));
        for (int i = 0; i < 10; i++) {
            clickLink();
            if (driver.findElement(NOTIFIC).getText().contains("Action successful")) {
                return true;
            }
        }
        return false;
    }
}

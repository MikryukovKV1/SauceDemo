package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HerokuappDynamicControlsPage extends BasePage {

    private final By BUTTON_REMOVE = By.xpath("//button[@onclick='swapCheckbox()']");
    private final By CHECKBOX = By.xpath("//*[text()=' A checkbox']");         //*[text()=' A checkbox']  //div[@id='checkbox']
    private final By TEXT_ITS_GONE = By.xpath("//p[@id='message']");

    public HerokuappDynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    public void waitTextItsGone() {
        driver.findElement(BUTTON_REMOVE).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TEXT_ITS_GONE));
    }

    public boolean isDisplayedCheckbox() {
        return !driver.findElements(CHECKBOX).isEmpty();
    }


}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappHoversProfilePage extends BasePage {

    private final By ERROR = By.xpath("//*[text()='Not Found']");

    public HerokuappHoversProfilePage(WebDriver driver) {
        super(driver);
    }

    public boolean getTextError() {
        return driver.findElement(ERROR).isDisplayed();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappHoversPage extends BasePage {

    private final String LINK_NAME_1_PATTERN = "//a[@href='/users/%s']";
    private final String NAME_1_PATTERN = "//*[text()='name: user%s']";
    private final String PROFILE_1_PATTERN = "//*[text()='name: user%s']/ancestor::div[@class='figure']";

    public HerokuappHoversPage(WebDriver driver) {
        super(driver);
    }

    public void hoveringProfile(String numberProfile) {
        By PROFILE = By.xpath(String.format(PROFILE_1_PATTERN, numberProfile));
        actions.moveToElement(driver.findElement(PROFILE)).perform();
    }

    public String getName(String numberName) {
        By NAME = By.xpath(String.format(NAME_1_PATTERN, numberName));
        return driver.findElement(NAME).getText();
    }

    public void clickLinkName(String numberName) {
        By LINK_NAME = By.xpath(String.format(LINK_NAME_1_PATTERN, numberName));
        driver.findElement(LINK_NAME).click();
    }
}

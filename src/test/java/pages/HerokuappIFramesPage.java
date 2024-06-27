package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappIFramesPage extends BasePage {

    private final By PARAGRAPH = By.xpath("//p");
    private final By IFRAME = By.id("mce_0_ifr");
    private final By CLOSE_BUTTON = By.xpath("//div[@class='tox-icon']/..");

    public HerokuappIFramesPage(WebDriver driver) {
        super(driver);
    }

    public String getTextParagraph() {
        driver.findElement(CLOSE_BUTTON).click();
        driver.switchTo().frame(driver.findElement(IFRAME));
        return driver.findElement(PARAGRAPH).getText();
    }
}
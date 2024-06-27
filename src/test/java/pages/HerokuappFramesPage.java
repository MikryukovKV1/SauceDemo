package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappFramesPage extends BasePage{

    private final By LINK_IFRAMES = By.xpath("//a[text()='iFrame']");

    public HerokuappFramesPage(WebDriver driver) {
        super(driver);
    }

    public void transitionIFramesPage() {
        driver.findElement(LINK_IFRAMES).click();
    }
}